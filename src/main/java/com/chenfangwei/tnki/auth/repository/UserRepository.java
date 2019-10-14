package com.chenfangwei.tnki.auth.repository;

import com.chenfangwei.tnki.auth.model.User;
import com.chenfangwei.tnki.share.jackson.DefaultObjectMapper;
import com.chenfangwei.tnki.share.model.BaseRepository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserRepository extends BaseRepository<User> {

    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final DefaultObjectMapper objectMapper;

    public UserRepository(NamedParameterJdbcTemplate jdbcTemplate,
                          DefaultObjectMapper objectMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.objectMapper = objectMapper;
    }

    @Override
    protected void doSave(User user) {
    }

    public void byId(String id) {

    }

    public User findByUsername(String username) {
        User user = new User();
        user.setID("U001");
        user.setUsername("Linus");
        user.setPassword("P123456");
        return user;
    }

}
