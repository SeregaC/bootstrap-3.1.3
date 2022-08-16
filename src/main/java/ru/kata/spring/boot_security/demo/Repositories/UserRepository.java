package ru.kata.spring.boot_security.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String username);
}
