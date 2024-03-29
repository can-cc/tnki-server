package com.chenfangwei.tnki.auth;

import com.chenfangwei.tnki.auth.command.LoginCommand;
import com.chenfangwei.tnki.auth.service.SecurityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AuthApplicationService {
    @Autowired
    private SecurityService securityService;

    public void login(LoginCommand command) {
        securityService.autoLogin(command.username, command.password);
    }
}
