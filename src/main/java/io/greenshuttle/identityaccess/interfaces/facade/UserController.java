package io.greenshuttle.identityaccess.interfaces.facade;

import io.greenshuttle.identityaccess.domain.identity.User;
import io.greenshuttle.identityaccess.domain.identity.UserRepository;
import io.greenshuttle.identityaccess.infrastructure.datascope.Policy;
import io.greenshuttle.identityaccess.infrastructure.datascope.annotation.DataScope;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yangzifeng
 */
@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/user")
    @DataScope(resourceCode = "owner_code", role = "ROLE_USER", policy = Policy.OWN)
    @Secured("ROLE_USER")
    public ResponseEntity<List<User>> fetchOwnerUser(){
        List<User> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }

}
