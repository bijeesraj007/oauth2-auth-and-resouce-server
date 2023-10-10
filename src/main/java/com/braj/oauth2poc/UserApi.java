package com.braj.oauth2poc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bijeesraj
 * @created 10/9/23
 */
@RestController
@RequestMapping("/api/v1")
public class UserApi {

    @GetMapping("/hello")
    public String login() {
    return "Hi there";
    }


    @PostMapping("/hello")
    public String create() {
        return "Created new user";
    }

}