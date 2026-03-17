package com.opito.tareacompunet2.model;


import jakarta.persistence.*;
import java.util.List;


@Entity
public class OptionGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "group")
    private List<Option> options;
}
