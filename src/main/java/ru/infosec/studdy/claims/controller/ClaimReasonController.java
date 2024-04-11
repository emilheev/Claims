package ru.infosec.studdy.claims.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.infosec.studdy.claims.model.dto.MakeReasonContextDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/claims/reason")
public class ClaimReasonController {

    @PostMapping
    public String makeReason(@RequestBody MakeReasonContextDto contextDto,
    @RequestHeader String userId) {
        //TODO
        return null;
    }

}
