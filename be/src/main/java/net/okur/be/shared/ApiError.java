package net.okur.be.shared;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/**
 * @author dogancan.okur 20.06.2023 01:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // if property is null it will not be serialized
public class ApiError {
  private int status;
  private String message;
  private String path;
  private long timestamp = new Date().getTime();
  private Map<String, String> validationErrors;

  public ApiError(int status, String message, String path) {
    this.status = status;
    this.message = message;
    this.path = path;
  }
}
