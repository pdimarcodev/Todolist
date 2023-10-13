package com.pdimarco.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

// interface para poder acceder a los métodos de JpaRepository: save, etc...
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}
