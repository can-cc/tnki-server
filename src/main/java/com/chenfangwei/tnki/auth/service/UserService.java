package com.chenfangwei.tnki.auth.service;

import com.chenfangwei.tnki.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}