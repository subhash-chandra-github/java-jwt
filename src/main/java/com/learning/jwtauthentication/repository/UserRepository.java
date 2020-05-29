package com.learning.jwtauthentication.repository;

import com.learning.jwtauthentication.model.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by subhashchandra on 3/5/20.
 */
@Repository
public interface UserRepository extends CrudRepository<UserDao,Long> {

    UserDao findByName(String username);
}
