package org.samsung.ktra.repositories.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@Setter
@Getter
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
public class Order {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        private User user;

        @Column(name = "total_qty", nullable = false)
        private Integer totalQty;

        @Column(name = "total_amount", nullable = false)
        private Long totalAmount;

        @Column(name = "status", nullable = false)
        private Boolean status;
        




}
