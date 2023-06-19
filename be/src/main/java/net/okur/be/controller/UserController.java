package net.okur.be.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import net.okur.be.entity.User;
import net.okur.be.model.output.UserOutput;
import net.okur.be.shared.CurrentUser;

/**
 * @author dogancan.okur 20.06.2023 01:16
 */
@RestController
@Slf4j
public class UserController {

  @PostMapping("/api/1.0/auth")
  public ResponseEntity<?> handleAuthentication(@CurrentUser User user) {
    UserOutput userOutput = new UserOutput();
    userOutput.setUsername(user.getUsername());
    userOutput.setDisplayName(user.getDisplayName());
    userOutput.setImage(user.getImage());
    return ResponseEntity.ok().body(userOutput);
  }

  @PostMapping("/api/1.0/users")
  public ResponseEntity<?> createUser() {
    return ResponseEntity.ok().build();
  }
}
