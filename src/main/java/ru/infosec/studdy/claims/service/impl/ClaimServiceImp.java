package ru.infosec.studdy.claims.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.infosec.studdy.claims.model.Claim;
import ru.infosec.studdy.claims.model.dto.ClaimCreateRequestDto;
import ru.infosec.studdy.claims.model.dto.ClaimCreateResponseDto;
import ru.infosec.studdy.claims.model.dto.ClaimDto;
import ru.infosec.studdy.claims.service.ClaimService;
import ru.infosec.studdy.claims.service.ClaimStorageService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClaimServiceImp implements ClaimService {

    private final ClaimStorageService claimStorageService;
    @Override
    public ClaimCreateResponseDto create(ClaimCreateRequestDto request) {

        Claim claim = claimStorageService.create(request);
        return new ClaimCreateResponseDto(claim.getUuid());
    }

    @Override
    public List<ClaimDto> getAll(String status) {
        return status == null? claimStorageService.getAll()
                .stream()
                .map(this::convert)
                .collect(Collectors.toList()):
                claimStorageService.getAll()
                        .stream().filter(it->it.getStatus().equals(status))
                        .map(this::convert)
                        .collect(Collectors.toList());
    }

    private ClaimDto convert(Claim it) {
        return new ClaimDto(it.getUuid(), it.getStatus());
    }
}
