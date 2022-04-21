package com.majortomdev.field.controller;

import com.majortomdev.field.entity.Field;
import com.majortomdev.field.service.FieldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/fields")
@Slf4j
public class FieldController {

    @Autowired
    private FieldService fieldService;

    @PostMapping("/")
    public Field saveField(@RequestBody Field field){
        log.info("Inside save field in my fieldController");
        return fieldService.saveField(field);
    }

    @GetMapping("/{id}")
    public Field findFieldById(@PathVariable("id") Long fieldId){
        log.info("Inside findFieldById in my fieldController");
        return fieldService.findFieldById(fieldId);
    }
}
