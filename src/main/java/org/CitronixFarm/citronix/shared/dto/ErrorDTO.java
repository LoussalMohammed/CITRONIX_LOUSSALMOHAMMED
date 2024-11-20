package org.CitronixFarm.citronix.shared.dto;

import java.time.LocalDateTime;

public record ErrorDTO(
        String message,
        Throwable cause,
        String errorCode,
        LocalDateTime timestamp
)
{}