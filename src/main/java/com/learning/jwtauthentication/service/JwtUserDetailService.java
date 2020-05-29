package com.learning.jwtauthentication.service;

import com.learning.jwtauthentication.model.UserDao;
import com.learning.jwtauthentication.model.UserDto;
import com.learning.jwtauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by subhashchandra on 3/5/20.
 */
@Service
public class JwtUserDetailService implements UserDetailsService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDao user = userRepository.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(),
                new ArrayList<>());
    }

    public String signUp(UserDto userDto) {
        UserDao userDao = new UserDao();
        userDao.setName(userDto.getName());
        userDao.setEmail(userDto.getEmail());
        userDao.setMobileNumnber(userDto.getMobileNumnber());
        userDao.setPassword(bcryptEncoder.encode(userDto.getPassword()));
        userRepository.save(userDao);
        return "Successfully signed up";
    }
}
