package com.majortomdev.field.service;

import com.majortomdev.field.entity.Field;
import com.majortomdev.field.repository.FieldRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FieldService {

    @Autowired
    private FieldRepository fieldRepository;

    public Field saveField(Field field) {
        log.info("Inside my save field in my fieldService");
        return fieldRepository.save(field);
    }

    public Field findFieldById(Long fieldId){
        log.info("Inside findFieldById in fieldService");
        return fieldRepository.findByFieldId(fieldId);
    }
}
