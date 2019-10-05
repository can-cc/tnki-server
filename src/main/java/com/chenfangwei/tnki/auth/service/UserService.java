package com.chenfangwei.tnki.auth.service;

import com.chenfangwei.tnki.auth.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}