package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(85201, "Y'shaarj", 'M', 1, 1, 1, 4));
        forumUserList.add(new ForumUser(18560, "Ragnaros", 'M', 1, 1, 1, 2));
        forumUserList.add(new ForumUser(50159, "Sylvanas", 'F', 129, 3, 21, 5));
        forumUserList.add(new ForumUser(68771, "Nathanos Blightcaller", 'M', 112, 4, 27, 0));
        forumUserList.add(new ForumUser(21210, "Murgglbl", 'M', 2019, 3, 17, 1));
    }

    public List<ForumUser> getUserList() {
        return forumUserList;
    }
}
