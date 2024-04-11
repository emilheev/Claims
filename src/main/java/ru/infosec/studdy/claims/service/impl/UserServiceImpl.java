package ru.infosec.studdy.claims.service.impl;

import org.springframework.stereotype.Service;
import ru.infosec.studdy.claims.model.dto.UserDto;
import ru.infosec.studdy.claims.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserDto> getAll() {
        return List.of(new UserDto(1L,"Операционист Катерина Петровна", List.of("OPERATOR", "USER")),
                new UserDto(2L,"Кассир Степан Егорьевич", List.of("CASHER")));
    }
}
