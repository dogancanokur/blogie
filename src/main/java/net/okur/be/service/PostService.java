package net.okur.be.service;

import java.util.List;

import net.okur.be.entity.Post;
import net.okur.be.model.input.PostInput;
import net.okur.be.model.output.PostOutput;

/**
 * @author dogancan.okur 20.06.2023 01:45
 */
public interface PostService {

  PostOutput createPost(PostInput postInput);

  Post getPostById(Long id);

  Post getPostBySlug(String slug);

  List<Post> getAllPosts();

  List<Post> getAllPostsByStatus(String status);

  List<Post> getAllPostsByCategoryNames(List<String> categories);

}
