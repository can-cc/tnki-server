package com.chenfangwei.tnki.auth.repository;

import com.chenfangwei.tnki.auth.model.User;
import com.chenfangwei.tnki.share.model.BaseRepository;
import org.springframework.stereotype.Component;

@Component
public class UserRepository extends BaseRepository<User> {

    public UserRepository() {
    }

    @Override
    protected void doSave(User user) {
    }

    public void byId(String id) {

    }

    public User findByUsername(String username) {
        User user = new User();
        user.setID("U001");
        user.setUsername("Linus");;
        user.setPassword("P123456");
        return user;
    }

}
