package com.ebp.starfleetbattles.backend;

import java.util.UUID;

public class UserNotFoundException extends RuntimeException{
    UserNotFoundException(UUID id){
        super("Could not find player with id: "+id);
    }

    UserNotFoundException(String emailAddress){
        super("Could not find player with emailAddress: "+emailAddress);
    }
}
