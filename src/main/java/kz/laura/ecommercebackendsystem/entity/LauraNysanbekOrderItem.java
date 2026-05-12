package kz.laura.ecommercebackendsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LauraNysanbekOrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private LauraNysanbekProduct product;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private LauraNysanbekOrder order;
}