package com.anil.securenotes.controllers;


import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping(value = "/admin")
//    @PreAuthorize("hasRole('ADMIN')")
    @Secured({"ROLE_ADMIN"})
    public String admin() {
        return "admin";
    }


    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('USER')")
    public String user() {
        return "user";
    }
}
