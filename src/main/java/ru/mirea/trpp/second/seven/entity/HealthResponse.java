package ru.mirea.trpp.second.seven.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/** Ответ на healthCheck. */
@Getter
@Setter
@AllArgsConstructor
public class HealthResponse {

    /** Статус работы. */
    private String status;

}
