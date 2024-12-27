package lk.icet.demo.service;

import lk.icet.demo.dto.User;
import org.springframework.web.bind.annotation.RequestBody;


public interface UserService {
     boolean login( User user);

     String register(User user);
}
