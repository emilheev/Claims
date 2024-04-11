package ru.infosec.studdy.claims.service;

public interface CreditHistoryPersonService {
    boolean getReasonByPersonHistory(String inn, String snils, String sum);
}
