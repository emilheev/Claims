package ru.infosec.studdy.claims.service;

import ru.infosec.studdy.claims.model.dto.MakeReasonContextDto;

import java.util.UUID;

public interface ClaimReasonService {
    String makeReason(MakeReasonContextDto makeReasonContextDto, Long userId);
}
