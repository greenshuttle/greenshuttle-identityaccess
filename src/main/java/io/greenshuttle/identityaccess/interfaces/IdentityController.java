package io.greenshuttle.identityaccess.interfaces;

import io.greenshuttle.identityaccess.interfaces.vo.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangzifeng
 */
@RestController
@RequestMapping("/oauth2/auth/requests/")
public class IdentityController {

    @RequestMapping("login")
    public ResponseEntity<LoginResponse> login(@RequestParam("login_challenge") String loginChallenge) {
        return null;
    }
}
