package com.learning.jwtauthentication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by subhashchandra on 3/5/20.
 */
@RestController
public class HomeController {

    @GetMapping("/home")
    public String Test()
    {
        return "Subhash Chandra";
    }
}
