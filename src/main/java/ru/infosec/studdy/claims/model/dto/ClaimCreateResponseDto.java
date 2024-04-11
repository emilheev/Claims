package ru.infosec.studdy.claims.model.dto;

import lombok.Data;
import lombok.Value;

import java.util.UUID;

@Value
public class ClaimCreateResponseDto {
    UUID claimUuid;
}
