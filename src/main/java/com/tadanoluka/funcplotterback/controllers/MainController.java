package com.tadanoluka.funcplotterback.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@CrossOrigin(originPatterns = {"http://localhost:3000", "http://localhost:3000/", "http://localhost:3000/**"})
@RequestMapping("/secured")
public class MainController {
    @GetMapping("/user")
    public String userAccess(Principal principal) {
        if (principal == null) {
            return null;
        }
        return principal.getName();
    }
}
