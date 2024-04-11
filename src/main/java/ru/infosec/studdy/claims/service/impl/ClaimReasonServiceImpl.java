package ru.infosec.studdy.claims.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.infosec.studdy.claims.model.Claim;
import ru.infosec.studdy.claims.model.dto.MakeReasonContextDto;
import ru.infosec.studdy.claims.service.ClaimReasonService;
import ru.infosec.studdy.claims.service.ClaimService;
import ru.infosec.studdy.claims.service.ClaimStorageService;
import ru.infosec.studdy.claims.service.CreditHistoryPersonService;

@Service
@RequiredArgsConstructor
public class ClaimReasonServiceImpl implements ClaimReasonService {
    private final ClaimStorageService claimStorageService;
    private final CreditHistoryPersonService creditHistoryPersonService;
    @Override
    public String makeReason(MakeReasonContextDto makeReasonContextDto, Long userId) {
        Claim claim = claimStorageService.getByUuid(makeReasonContextDto.getClaimUuid())
                .orElseThrow(()-> new RuntimeException("Claim by uuid: " +
                        makeReasonContextDto.getClaimUuid() + " not found"));
        boolean reasonByCreditHistory  = creditHistoryPersonService.getReasonByPersonHistory(claim.getInn(), claim.getSnils(), claim.getSum());

        return null;
    }
}
