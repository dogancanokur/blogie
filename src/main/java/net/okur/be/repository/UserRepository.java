package net.okur.be.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.okur.be.entity.User;

/**
 * @author dogancan.okur 20.06.2023 01:17
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User getUserByUsername(String username);

  Optional<User> findByUsername(String value);
}
