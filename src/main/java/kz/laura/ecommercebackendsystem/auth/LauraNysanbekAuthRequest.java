package kz.laura.ecommercebackendsystem.auth;

import lombok.Data;

@Data
public class LauraNysanbekAuthRequest {

    private String email;

    private String password;
}