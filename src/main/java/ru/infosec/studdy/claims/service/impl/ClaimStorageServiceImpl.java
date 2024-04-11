package ru.infosec.studdy.claims.service.impl;

import org.springframework.stereotype.Service;
import ru.infosec.studdy.claims.model.Claim;
import ru.infosec.studdy.claims.model.dto.ClaimCreateRequestDto;
import ru.infosec.studdy.claims.service.ClaimStorageService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClaimStorageServiceImpl implements ClaimStorageService {
    private List<Claim> claimList = new ArrayList<>();

    @Override
    public Claim create(ClaimCreateRequestDto requestDto) {
        Claim claim = Claim.builder()
                .inn(requestDto.getInn())
                .snils(requestDto.getSnils())
                .status("CREATED")
                .uuid(UUID.randomUUID())
                .build();
        claimList.add(claim);
        return claim;
    }

    @Override
    public List<Claim> getAll() {
        return claimList;
    }

    @Override
    public Optional<Claim> getByUuid(UUID claimUuid) {
        //TODO
        return Optional.empty();
    }
}
