package kz.laura.ecommercebackendsystem.repository;

import kz.laura.ecommercebackendsystem.entity.LauraNysanbekOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LauraNysanbekOrderItemRepository
        extends JpaRepository<LauraNysanbekOrderItem, Long> {
}