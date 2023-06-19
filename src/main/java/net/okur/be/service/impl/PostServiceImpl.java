package net.okur.be.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.okur.be.entity.Post;
import net.okur.be.model.input.PostInput;
import net.okur.be.model.output.PostOutput;
import net.okur.be.repository.PostRepository;
import net.okur.be.service.PostService;

/**
 * @author dogancan.okur 20.06.2023 01:46
 */
@Service
public class PostServiceImpl implements PostService {
  private final PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public PostOutput createPost(PostInput postInput) {
    return null;
  }

  @Override
  public Post getPostById(Long id) {
    return postRepository.getReferenceById(id);
  }

  @Override
  public Post getPostBySlug(String slug) {
    return postRepository.getBySlug(slug);
  }

  @Override
  public List<Post> getAllPosts() {
    return null;
  }

  @Override
  public List<Post> getAllPostsByStatus(String status) {
    return null;
  }

  @Override
  public List<Post> getAllPostsByCategoryNames(List<String> categories) {
    return null;
  }
}
