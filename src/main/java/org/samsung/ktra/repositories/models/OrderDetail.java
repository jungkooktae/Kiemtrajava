package org.samsung.ktra.repositories.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@Setter
@Getter
@Table(name = "orderDetail")
@NoArgsConstructor
@AllArgsConstructor

public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "unit_price")
    private Long unitPrice;

    @Column(name = "qty")
    private Integer qty;


}
