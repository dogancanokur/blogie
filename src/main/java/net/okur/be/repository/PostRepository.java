package net.okur.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.okur.be.entity.Post;

/**
 * @author dogancan.okur 20.06.2023 01:45
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
  Post getBySlug(String slug);

  Post getByCategories_title(String title);
}
