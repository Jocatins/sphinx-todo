package com.sphinxtodo.sphinxtodo.repos;

import com.sphinxtodo.sphinxtodo.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
