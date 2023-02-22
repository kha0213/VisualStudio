package com.example.mvcseminar.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Positive
    Long userId;
    @NotBlank
    String name;
    @Pattern(regexp = "[MF]")
    Gender gender;

    String loginId;
    @Email
    String email;

    public static User of(UserRequestDto dto) {
        return new User(dto.getUserId(), dto.getName(),
                Gender.of(dto.getGender()), dto.getLoginId(), dto.getEmail());
    }
}
