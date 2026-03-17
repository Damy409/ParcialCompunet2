package com.opito.tareacompunet2.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.opito.tareacompunet2.model.Section;
import com.opito.tareacompunet2.repository.SectionRepository;
import com.opito.tareacompunet2.service.SectionService;

@Service
public class SectionServiceImpl implements SectionService {

    private final SectionRepository sectionRepository;

    public SectionServiceImpl(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    @Override
    public List<Section> findAll() {
        return sectionRepository.findAll();
    }

    @Override
    public Section findById(Long id) {
        return sectionRepository.findById(id).orElse(null);
    }

    @Override
    public Section save(Section section) {
        return sectionRepository.save(section);
    }

    @Override
    public Section update(Long id, Section section) {
        return sectionRepository.save(section);
    }

    @Override
    public void deleteById(Long id) {
        sectionRepository.deleteById(id);
    }

    @Override
    public List<Section> findRootSections(Long surveyId) {
        return sectionRepository.findBySurveyIdAndParentSectionIsNull(surveyId);
    }

}
