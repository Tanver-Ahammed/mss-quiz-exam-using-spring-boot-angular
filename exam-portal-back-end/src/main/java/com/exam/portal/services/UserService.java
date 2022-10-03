package com.exam.portal.services;

import com.exam.portal.dto.UserDTO;
import com.exam.portal.entities.User;

import java.util.List;

public interface UserService {

    UserDTO registrationUser(UserDTO userDTO) throws Exception;

    List<UserDTO> findAllUsers();

    UserDTO getSingleUserById(Long userId);

    UserDTO getUserByUsername(String username);

    void deleteUser(Long userId);

    UserDTO updateUser(UserDTO userDTO, Long userId);

    UserDTO forgetPassword(UserDTO userDTO);

    void forgetPasswordSet(UserDTO userDTO);
}
