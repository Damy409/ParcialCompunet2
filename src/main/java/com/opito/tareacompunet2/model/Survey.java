package com.opito.tareacompunet2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String intro;

    private String validation;

    private String imageUrl;

    @Column(columnDefinition = "TEXT")
    private String outro;

    @Column(columnDefinition = "TEXT")
    private String styles;

    @OneToMany(mappedBy = "survey")
    private List<Section> sections;

    @OneToMany(mappedBy = "survey")
    private List<Interview> interviews;

    // getters y setters
}