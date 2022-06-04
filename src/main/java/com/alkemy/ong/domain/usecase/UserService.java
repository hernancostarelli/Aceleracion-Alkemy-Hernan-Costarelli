package com.alkemy.ong.domain.usecase;

import com.alkemy.ong.domain.model.UserList;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserList getList(PageRequest pageRequest);
}