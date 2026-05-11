package kz.laura.ecommercebackendsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LauraNysanbekProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double price;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private LauraNysanbekCategory category;
}