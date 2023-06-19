package net.okur.be.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import net.okur.be.enums.Status.Status;

/**
 * @author dogancan.okur 20.06.2023 01:33
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "posts")
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", nullable = false)
  private Long id;
  @Column(length = 100, nullable = false)
  private String title;
  @Column(length = 10000, nullable = false, columnDefinition = "TEXT", name = "content")
  private String content;
  @Column(name = "created_date", nullable = false, updatable = false)
  @CreationTimestamp
  private LocalDateTime createdDate;
  @Column(name = "updated_date")
  private LocalDateTime updatedDate;
  @Column(name = "slug", nullable = false, unique = true)
  private String slug;
  @Enumerated(EnumType.STRING)
  private Status status;
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User author;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "parent_post_id")
  private Post parentPost;
  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinTable(name = "posts_categories", joinColumns = @JoinColumn(name = "post_id"))
  private List<Category> categories = new ArrayList<>();

}
