package net.okur.be.model.output;

import java.time.LocalDateTime;
import java.util.List;

import lombok.EqualsAndHashCode;
import net.okur.be.enums.Status.Status;
import net.okur.be.shared.ServiceOutput;

/**
 * @author dogancan.okur 20.06.2023 01:43
 */
@EqualsAndHashCode(callSuper = false)
public class PostOutput extends ServiceOutput {
  private Long id;
  private String slug;
  private String title;
  private String content;
  private String username;
  private Status status;
  private LocalDateTime createdDate;
  private LocalDateTime lastModifiedDate;
  private String lastModifiedBy;
  private List<String> tags;
  private List<String> categories;
}
