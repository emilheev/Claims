package ru.infosec.studdy.claims.service.impl;

import org.springframework.stereotype.Service;
import ru.infosec.studdy.claims.service.CreditHistoryPersonService;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

@Service

public class CreditHistoryPersonServiceImll  implements CreditHistoryPersonService {
    @Override
    public boolean getReasonByPersonHistory(String inn, String snils, String sum) {
        try {
            return SecureRandom.getInstanceStrong().nextBoolean();
        } catch (NoSuchAlgorithmException e) {
            return false;
        }
    }
}
