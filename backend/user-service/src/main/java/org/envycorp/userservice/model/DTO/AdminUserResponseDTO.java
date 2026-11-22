package org.envycorp.userservice.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminUserResponseDTO {
    private UUID userId;
    private String username;
    private String preferredLanguageCode;
    private Instant createdAt;
    private Instant updatedAt;
}
