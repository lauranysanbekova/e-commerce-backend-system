package kz.laura.ecommercebackendsystem.repository;

import kz.laura.ecommercebackendsystem.entity.LauraNysanbekProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LauraNysanbekProductRepository
        extends JpaRepository<LauraNysanbekProduct, Long> {

    List<LauraNysanbekProduct> findByNameContainingIgnoreCase(String name);
}