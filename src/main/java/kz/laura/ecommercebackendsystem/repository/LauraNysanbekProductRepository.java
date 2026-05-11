package kz.laura.ecommercebackendsystem.repository;

import kz.laura.ecommercebackendsystem.entity.LauraNysanbekProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LauraNysanbekProductRepository
        extends JpaRepository<LauraNysanbekProduct, Long> {
}