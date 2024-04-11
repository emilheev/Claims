package ru.infosec.studdy.claims.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.infosec.studdy.claims.model.dto.ClaimCreateRequestDto;
import ru.infosec.studdy.claims.model.dto.ClaimCreateResponseDto;
import ru.infosec.studdy.claims.model.dto.ClaimDto;
import ru.infosec.studdy.claims.service.ClaimService;

import java.util.List;

@RequestMapping("/api/v1/claims")
@RestController
@RequiredArgsConstructor
public class ClaimController {

    private final ClaimService claimService;
    @PostMapping
    public ClaimCreateResponseDto createClaim(@RequestBody ClaimCreateRequestDto request) {
        return claimService.create(request);
    }

    @GetMapping
    public List<ClaimDto> getAll(@RequestParam(required = false) String status) {
        return claimService.getAll(status);
    }

}
