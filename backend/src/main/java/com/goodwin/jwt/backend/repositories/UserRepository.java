package com.goodwin.jwt.backend.repositories;

package com.sergio.jwt.backend.repositories;

import com.goodwin.jwt.backend.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);
}