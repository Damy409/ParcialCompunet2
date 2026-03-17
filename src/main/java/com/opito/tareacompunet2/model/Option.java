package com.opito.tareacompunet2.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private OptionGroup group;
}
