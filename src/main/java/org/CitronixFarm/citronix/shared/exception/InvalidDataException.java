package org.CitronixFarm.citronix.shared.exception;

import org.springframework.http.HttpStatus;

import static org.wrmList.waitingList.shared.constant.ErrorCodes.INVALID_DATA;

public class InvalidDataException extends BaseException {
    public InvalidDataException(String message) {
        super(message, INVALID_DATA, HttpStatus.BAD_REQUEST);
    }
}
