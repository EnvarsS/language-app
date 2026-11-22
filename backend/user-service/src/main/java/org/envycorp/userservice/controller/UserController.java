package org.envycorp.userservice.controller;

import lombok.RequiredArgsConstructor;
import org.envycorp.userservice.model.DTO.UserRequestDTO;
import org.envycorp.userservice.model.DTO.UserResponseDTO;
import org.envycorp.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/me")
    public ResponseEntity<UserResponseDTO> getCurrentUser(@RequestHeader("X-User-id") UUID userId) {

    }

    @PutMapping("/me")
    public ResponseEntity<UserResponseDTO> updateCurrentUser(
            @RequestHeader("X-User-id") UUID userId,
            @RequestBody UserRequestDTO userRequestDTO) {

    }

    @DeleteMapping("/me")
    public ResponseEntity<Void> deleteCurrentUser(@RequestHeader("X-User-id") UUID userId) {

    }

    @GetMapping("/availability")
    public Boolean checkUserNameAvailability(@RequestParam UUID username) {

    }

    @GetMapping("/{username}")
    public ResponseEntity<UserResponseDTO> getUserByUsername(@PathVariable UUID username) {

    }
}
