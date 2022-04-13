package com.majortomdev.user.UserWithField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Field {

    private Long fieldId;
    private String fieldName;
    private String fieldInfo;
    private String fieldCode;
}
