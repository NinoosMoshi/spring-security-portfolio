package com.ninos.controller;

import com.ninos.jwt.JwtAuthenticationFilter;
import com.ninos.jwt.JwtLogin;
import com.ninos.security.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginRegistrationController {

    private JwtAuthenticationFilter jwtAuthenticationFilter;

    @Autowired
    public LoginRegistrationController(JwtAuthenticationFilter jwtAuthenticationFilter) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }


    // http://localhost:8080/signin
    @PostMapping("/signin")
    public LoginResponse logIn(@RequestBody JwtLogin jwtLogin){
        return jwtAuthenticationFilter.login(jwtLogin);
    }





}
