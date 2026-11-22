package org.envycorp.userservice.controller;

import lombok.RequiredArgsConstructor;
import org.envycorp.userservice.model.DTO.AdminUserResponseDTO;
import org.envycorp.userservice.model.DTO.UserRequestDTO;
import org.envycorp.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/admin/users")
@RequiredArgsConstructor
public class AdminUserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public AdminUserResponseDTO getUserById(@PathVariable UUID userId) {

    }

    @GetMapping
    public List<AdminUserResponseDTO> getUsersPage(@RequestParam int page, @RequestParam int size) {

    }

    @PutMapping("/{userId}")
    public AdminUserResponseDTO updateUser(@PathVariable UUID userId, @RequestBody UserRequestDTO requestDTO) {

    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID userId) {

    }
}
