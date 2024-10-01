package com.ritallus.dailybookapi.commons;


import com.ritallus.dailybookapi.commons.exceptions.RequiredException;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CustomUtilService {

    public static void ValidateRequired(Object object) {
        if (Objects.isNull(object)) {
            throw new RequiredException(MessageResponse.MISSING_REQUIRED_FIELD);
        }
    }

    public static void ValidateBooleanRequired(Object object) {
        if (!(object instanceof Boolean)) {
            throw new RequiredException(MessageResponse.MISSING_REQUIRED_FIELD);
        }
    }
}
