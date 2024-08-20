package org.samsung.ktra.repositories.models;

import jakarta.persistence.*;

@Entity
public class Catalog {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name", length = 150, nullable = false)
        private String name;

        @Column(name = "status", nullable = false)
        private Boolean status; // true (1) if in use, false (0) if not in use

        // Getters and Setters


}
