package com.opito.tareacompunet2.service;

import java.util.List;
import com.opito.tareacompunet2.model.Type;

public interface TypeService {

    List<Type> findAll();

    Type findById(Long id);

    Type save(Type type);

    Type update(Long id, Type type);

    void deleteById(Long id);

}
