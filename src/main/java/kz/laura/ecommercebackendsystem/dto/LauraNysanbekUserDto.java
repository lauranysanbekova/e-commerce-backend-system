package kz.laura.ecommercebackendsystem.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LauraNysanbekUserDto {

    private Long id;

    private String fullName;

    private String email;

    private String role;
}