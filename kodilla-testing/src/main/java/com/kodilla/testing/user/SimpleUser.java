package com.kodilla.testing.user;

public class SimpleUser {

<<<<<<< HEAD
    private final String username;
=======
   private String username;
>>>>>>> 153e89befbb1ba355fc88720428a682137bcff7a
    private String realName;

    public SimpleUser(String username) {
        this.username = username;
    }

    public SimpleUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
