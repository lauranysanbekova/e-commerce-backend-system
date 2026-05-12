package kz.laura.ecommercebackendsystem.repository;

import kz.laura.ecommercebackendsystem.entity.LauraNysanbekUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LauraNysanbekUserRepository
        extends JpaRepository<LauraNysanbekUser, Long> {

    Optional<LauraNysanbekUser> findByEmail(String email);
}