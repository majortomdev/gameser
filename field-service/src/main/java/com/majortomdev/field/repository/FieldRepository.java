package com.majortomdev.field.repository;

import com.majortomdev.field.entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends JpaRepository <Field, Long> {

    Field findByFieldId(Long fieldId);
}
