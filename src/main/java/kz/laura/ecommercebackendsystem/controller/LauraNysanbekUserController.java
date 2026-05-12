package kz.laura.ecommercebackendsystem.controller;

import jakarta.validation.Valid;
import kz.laura.ecommercebackendsystem.dto.LauraNysanbekUserDto;
import kz.laura.ecommercebackendsystem.entity.LauraNysanbekUser;
import kz.laura.ecommercebackendsystem.service.LauraNysanbekUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class LauraNysanbekUserController {

    private final LauraNysanbekUserService userService;

    @GetMapping
    public List<LauraNysanbekUserDto> getAllUsers() {

        return userService.getAllUsers();
    }

    @PostMapping
    public LauraNysanbekUser createUser(
            @Valid @RequestBody LauraNysanbekUser user) {

        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public LauraNysanbekUser updateUser(
            @PathVariable Long id,
            @RequestBody LauraNysanbekUser user) {

        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);

        return "User deleted successfully";
    }
}