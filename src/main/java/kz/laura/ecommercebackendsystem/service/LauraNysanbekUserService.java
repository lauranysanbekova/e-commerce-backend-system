package kz.laura.ecommercebackendsystem.service;

import kz.laura.ecommercebackendsystem.dto.LauraNysanbekUserDto;
import kz.laura.ecommercebackendsystem.entity.LauraNysanbekUser;
import kz.laura.ecommercebackendsystem.repository.LauraNysanbekUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LauraNysanbekUserService {

    private final LauraNysanbekUserRepository userRepository;

    public List<LauraNysanbekUserDto> getAllUsers() {

        return userRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public LauraNysanbekUser createUser(LauraNysanbekUser user) {

        return userRepository.save(user);
    }

    public LauraNysanbekUser updateUser(Long id, LauraNysanbekUser updatedUser) {

        LauraNysanbekUser user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setFullName(updatedUser.getFullName());
        user.setEmail(updatedUser.getEmail());
        user.setPassword(updatedUser.getPassword());
        user.setRole(updatedUser.getRole());

        return userRepository.save(user);
    }

    public void deleteUser(Long id) {

        userRepository.deleteById(id);
    }

    private LauraNysanbekUserDto mapToDto(LauraNysanbekUser user) {

        return LauraNysanbekUserDto.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }
}