package net.okur.be.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.okur.be.entity.User;
import net.okur.be.repository.UserRepository;

/**
 * @author dogancan.okur 20.06.2023 01:20
 */
@Service
public class UserAuthService implements UserDetailsService {
  private final UserRepository userRepository;

  @Autowired
  public UserAuthService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User userInDb = userRepository.getUserByUsername(username);
    if (userInDb == null) {
      throw new UsernameNotFoundException("User not found");
    }

    return userInDb;
  }
}
