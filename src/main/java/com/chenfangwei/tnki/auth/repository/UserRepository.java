package com.chenfangwei.tnki.auth.repository;

import com.chenfangwei.tnki.auth.model.User;
import com.chenfangwei.tnki.share.model.BaseRepository;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

import static com.google.common.collect.ImmutableMap.of;

public class UserRepository extends BaseRepository<User> {

    public UserRepository() {
    }

    @Override
    protected void doSave(User user) {
    }

    public void byId(String id) {

    }


}
