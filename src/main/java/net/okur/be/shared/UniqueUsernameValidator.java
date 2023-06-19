package net.okur.be.shared;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import net.okur.be.repository.UserRepository;

/**
 * @author dogancan.okur 20.06.2023 01:29
 */
public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {
  private final UserRepository userRepository;

  @Autowired
  public UniqueUsernameValidator(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void initialize(UniqueUsername constraintAnnotation) {
    ConstraintValidator.super.initialize(constraintAnnotation);
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return userRepository.findByUsername(value).isEmpty();
  }
}
