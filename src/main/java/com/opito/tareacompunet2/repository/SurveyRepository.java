package com.opito.tareacompunet2.repository;

import com.opito.tareacompunet2.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

    // Buscar encuestas por nombre (like)
    List<Survey> findByNameContaining(String name);




}

