package com.example.notalmabackend.entity;
import jakarta.persistence.* ;
@Entity
@Table(name="user")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    private String email;

}
