package fi.vm.yti.security.config;

import java.util.UUID;

import fi.vm.yti.security.YtiUser;

public final class TokenUserLogin {

    private final String id;
    private final String email;
    private final String firstName;
    private final String lastName;

    public TokenUserLogin(final YtiUser ytiUser) {
        this.id = ytiUser.getId();
        this.email = ytiUser.getEmail();
        this.firstName = ytiUser.getFirstName();
        this.lastName = ytiUser.getLastName();
    }

    String getId() {
        return id;
    }

    String getEmail() {
        return email;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}
