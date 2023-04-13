package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Post {
    @Id
    Long id;

    @Column
    Long userId;

    @Column
    String title;
    @Lob
    @Column(columnDefinition="text")
    String text;
}
