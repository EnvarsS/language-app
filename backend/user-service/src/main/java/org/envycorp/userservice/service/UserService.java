package org.envycorp.userservice.service;

import lombok.AllArgsConstructor;
import org.envycorp.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;


}
