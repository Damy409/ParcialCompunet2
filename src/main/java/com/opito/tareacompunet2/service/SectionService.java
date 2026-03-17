package com.opito.tareacompunet2.service;

import java.util.List;
import com.opito.tareacompunet2.model.Section;

public interface SectionService {

    List<Section> findAll();

    Section findById(Long id);

    Section save(Section section);

    Section update(Long id, Section section);

    void deleteById(Long id);

    List<Section> findRootSections(Long surveyId);

}