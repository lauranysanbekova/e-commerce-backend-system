package kz.laura.ecommercebackendsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LauraNysanbekOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime orderDate;

    private Double totalPrice;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private LauraNysanbekUser user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<LauraNysanbekOrderItem> orderItems;
}