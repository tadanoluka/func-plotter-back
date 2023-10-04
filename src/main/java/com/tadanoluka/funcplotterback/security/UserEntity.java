package com.tadanoluka.funcplotterback.security;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;

}