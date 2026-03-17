package com.opito.tareacompunet2.model;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String flag;

    private Integer orderCol;

    private String type;

    private String backgroundImage;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section parentSection;

    @OneToMany(mappedBy = "parentSection")
    private List<Section> subSections;

    @OneToMany(mappedBy = "section")
    private List<Question> questions;
}
