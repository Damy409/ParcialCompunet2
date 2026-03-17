package com.opito.tareacompunet2.repository;

import com.opito.tareacompunet2.model.OptionQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OptionQuestionRepository extends JpaRepository<OptionQuestion, Long> {

    // Obtener todas las opciones disponibles para una pregunta específica.
    List<OptionQuestion> findByQuestionId(Long questionId);

}
