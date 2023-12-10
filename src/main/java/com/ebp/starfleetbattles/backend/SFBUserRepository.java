package com.ebp.starfleetbattles.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface SFBUserRepository extends JpaRepository<SFBUser, UUID> {
    @Query(value = "SELECT * FROM sfbuser WHERE email_address=?", nativeQuery=true)
    public SFBUser findUserIdByEmailAddress(String emailAddress);

    @Query(value = "SELECT * FROM sfbuser WHERE email_address=? AND password=?", nativeQuery = true)
    public SFBUser checkEmailPassword(String emailAddress, String password);
}
