package net.okur.be.model.input;

import java.util.List;

import lombok.Data;

/**
 * @author dogancan.okur 20.06.2023 01:39
 */
@Data
public class PostInput {
  Long id;
  String title;
  String content;
  String username;
  List<String> tags;
  List<String> categories;
}
