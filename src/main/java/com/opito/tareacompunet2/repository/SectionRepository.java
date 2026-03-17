package com.opito.tareacompunet2.repository;


import com.opito.tareacompunet2.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Long> {

    // Obtener secciones raíz de una encuesta
    List<Section> findBySurveyIdAndParentSectionIsNull(Long surveyId);

}