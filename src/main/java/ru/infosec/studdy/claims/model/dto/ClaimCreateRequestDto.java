package ru.infosec.studdy.claims.model.dto;

import lombok.Data;
import lombok.Value;

@Value
public class ClaimCreateRequestDto {
    String inn;
    String snils;
    Integer sum;
}
