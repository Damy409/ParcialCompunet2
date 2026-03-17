package com.opito.tareacompunet2.repository;


import com.opito.tareacompunet2.model.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OptionRepository extends JpaRepository<Option, Long> {

    // Obtener las opciones de un grupo específico.
    List<Option> findByGroupId(Long groupId);

}
