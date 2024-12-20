package org.CitronixFarm.citronix.shared.exception;

import org.springframework.http.HttpStatus;

import static org.wrmList.waitingList.shared.constant.ErrorCodes.VALIDATION_ERROR;

public class ValidationException extends BaseException {
    public ValidationException(String message) {
        super(message, VALIDATION_ERROR, HttpStatus.BAD_REQUEST);
    }
}