package com.chenfangwei.tnki.auth;

import com.chenfangwei.tnki.auth.command.LoginCommand;
import com.chenfangwei.tnki.auth.service.SecurityService;
import com.chenfangwei.tnki.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private AuthApplicationService authApplicationService;


    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody @Valid LoginCommand command) {
        authApplicationService.login(command);
        return "login";
    }


}
