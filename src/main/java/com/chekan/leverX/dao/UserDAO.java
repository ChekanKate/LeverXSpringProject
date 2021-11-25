package com.chekan.leverX.dao;

import com.chekan.leverX.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO{

    public void saveUser(User user);
}
