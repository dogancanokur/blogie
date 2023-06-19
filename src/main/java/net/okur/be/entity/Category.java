package net.okur.be.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author dogancan.okur 20.06.2023 01:37
 */
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "posts")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", nullable = false)
  private Long id;
  @Column(length = 100, nullable = false)
  private String name;
  @Column(length = 100, nullable = false, unique = true)
  private String slug;
  @Column(length = 250, nullable = false, columnDefinition = "TEXT", name = "description")
  private String description;
  @ManyToMany(mappedBy = "categories")
  private List<Post> posts;

}
