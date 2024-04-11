package ru.infosec.studdy.claims.service;

import ru.infosec.studdy.claims.model.dto.ClaimCreateRequestDto;
import ru.infosec.studdy.claims.model.dto.ClaimCreateResponseDto;
import ru.infosec.studdy.claims.model.dto.ClaimDto;

import java.util.List;

public interface ClaimService {
    ClaimCreateResponseDto create(ClaimCreateRequestDto request);

    List<ClaimDto> getAll(String status);
}
