package com.example.demo.controller;

import com.example.demo.models.ApplicationUser;
import com.example.demo.models.LoginResponseDTO;
import com.example.demo.models.RegistrationDTO;
import com.example.demo.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO body){
        return  authService.registerUser(body.getUsername(), body.getPassword());
    }
    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body){
        return authService.loginUser(body.getUsername(),body.getPassword());
    }
}
