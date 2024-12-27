package lk.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lk.icet.demo.dto.User;
import lk.icet.demo.entity.UserEntity;
import lk.icet.demo.repository.UserRepository;
import lk.icet.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

     UserRepository repository;
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {

        repository.save( new ObjectMapper().convertValue(user, UserEntity.class));
        return "ok";
    }
}
