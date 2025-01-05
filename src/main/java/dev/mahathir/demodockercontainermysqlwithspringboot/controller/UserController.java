package dev.mahathir.demodockercontainermysqlwithspringboot.controller;

import dev.mahathir.demodockercontainermysqlwithspringboot.entity.User;
import dev.mahathir.demodockercontainermysqlwithspringboot.repossitory.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all-users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        userRepository.save(user);
        return null;
    }
}
