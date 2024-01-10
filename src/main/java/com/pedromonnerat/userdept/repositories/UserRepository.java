package com.pedromonnerat.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedromonnerat.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
