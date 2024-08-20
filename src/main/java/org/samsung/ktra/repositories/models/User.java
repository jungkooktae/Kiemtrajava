package org.samsung.ktra.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "username", length = 150, nullable = false, unique = true)
        private String username;

        @Column(name = "password", length = 50, nullable = false)
        private String password;

        @Column(name = "email", length = 150, nullable = false)
        private String email;

        @Column(name = "fullname", length = 150)
        private String fullname;

        @Column(name = "status", nullable = false)
        private Boolean status; // true (1) for active, false (0) for inactive
        private String confirmpassword;





}
