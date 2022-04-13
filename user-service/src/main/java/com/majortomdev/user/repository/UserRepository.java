package com.majortomdev.user.repository;
//By JoeK 13-04-22
import com.majortomdev.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserId(Long userId);
}
