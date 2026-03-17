package com.opito.tareacompunet2.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


@Entity
public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime timeStart;

    private LocalDateTime timeEnd;

    private Integer interviewerId;

    private String username;

    private Integer institutionId;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;

    @OneToMany(mappedBy = "interview")
    private List<Answer> answers;
}