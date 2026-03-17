package com.opito.tareacompunet2.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
public class OptionQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private OptionGroup group;
}