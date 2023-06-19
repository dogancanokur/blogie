package net.okur.be.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.okur.be.repository.UserRepository;
import net.okur.be.service.UserService;

/**
 * @author dogancan.okur 20.06.2023 01:17
 */
@Service
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }
}
