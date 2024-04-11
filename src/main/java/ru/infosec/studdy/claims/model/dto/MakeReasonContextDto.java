package ru.infosec.studdy.claims.model.dto;

import lombok.Value;

import java.util.UUID;

@Value
public class MakeReasonContextDto {
    UUID claimUuid;
}
