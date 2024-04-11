package ru.infosec.studdy.claims.model;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class Claim {
    Long id;
    UUID uuid;
    String status;
    String inn;
    String snils;
    String sum;
}
