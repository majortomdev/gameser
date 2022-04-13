package com.majortomdev.user.UserWithField;

import com.majortomdev.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateUWF {

    private User user;
    private Field field;
}
