package ru.infosec.studdy.claims.model.dto;

import lombok.Value;

import java.util.List;

@Value
public class UserDto {
    Long id;
    String fio;
    List<String> role;
}
