package com.opito.tareacompunet2.model;

import jakarta.persistence.*;


@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String tableName;
}
