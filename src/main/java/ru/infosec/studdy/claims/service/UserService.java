package ru.infosec.studdy.claims.service;

import ru.infosec.studdy.claims.model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAll();
}
