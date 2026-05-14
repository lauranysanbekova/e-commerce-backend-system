package kz.laura.ecommercebackendsystem.auth;

import kz.laura.ecommercebackendsystem.entity.LauraNysanbekUser;
import kz.laura.ecommercebackendsystem.repository.LauraNysanbekUserRepository;
import kz.laura.ecommercebackendsystem.security.LauraNysanbekJwtUtil;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class LauraNysanbekAuthController {

    private final LauraNysanbekUserRepository userRepository;

    private final LauraNysanbekJwtUtil jwtUtil;

    @PostMapping("/register")
    public LauraNysanbekUser register(
            @RequestBody LauraNysanbekUser user) {

        return userRepository.save(user);
    }

    @PostMapping("/login")
    public LauraNysanbekAuthResponse login(
            @RequestBody LauraNysanbekAuthRequest request) {

        LauraNysanbekUser user = userRepository
                .findByEmail(request.getEmail())
                .orElseThrow(() ->
                        new RuntimeException("User not found"));

        if (!user.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        String token = jwtUtil.generateToken(user.getEmail());

        return new LauraNysanbekAuthResponse(token);
    }
}