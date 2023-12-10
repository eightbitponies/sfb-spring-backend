package com.ebp.starfleetbattles.backend;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class SFBUserController {
    private final SFBUserRepository repository;

    SFBUserController(SFBUserRepository repository) {
        this.repository = repository;
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/user/login")
    SFBUser getOrCreateUser(@RequestBody SFBUser login) {
        SFBUser retrievedUser =  repository.checkEmailPassword(login.getEmailAddress(), login.getPassword());
        return retrievedUser;

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/user/register")
    SFBUser registerNewUser(@RequestBody SFBUser newUser){
        SFBUser foundUser = repository.findUserIdByEmailAddress(newUser.getEmailAddress());
        if(null != foundUser){
            return foundUser;
        }

        newUser.setId(UUID.randomUUID());
        return repository.save(newUser);
    }

}
