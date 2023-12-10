package com.ebp.starfleetbattles.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;
import java.util.UUID;

@Entity
public class SFBUser {
    private @Id
    @GeneratedValue UUID id;
    private String displayName;
    private String emailAddress;
    private String password;

    SFBUser() {
    }



    SFBUser(UUID id, String displayName, String emailAddress, String password) {
        this.id = id;
        this.displayName = displayName;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SFBUser)) return false;
        SFBUser user = (SFBUser) o;
        return Objects.equals(this.id, user.id)
                && Objects.equals(this.displayName, user.displayName)
                && Objects.equals(this.emailAddress, user.emailAddress)
                && Objects.equals(this.password, user.password);
    }

    @Override
    public String toString() {
        return "User{" + "id=" + this.id + ", displayName=" + this.displayName + ", emailAddress=" + this.emailAddress + '\'' + "}";
    }
}
