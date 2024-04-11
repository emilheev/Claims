package ru.infosec.studdy.claims.service;

import ru.infosec.studdy.claims.model.Claim;
import ru.infosec.studdy.claims.model.dto.ClaimCreateRequestDto;
import ru.infosec.studdy.claims.model.dto.ClaimDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClaimStorageService {
    Claim create(ClaimCreateRequestDto requestDto);

    List<Claim> getAll();

    Optional<Claim> getByUuid(UUID claimUuid);
}
