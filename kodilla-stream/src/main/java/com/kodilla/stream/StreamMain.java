package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum azerothForum = new Forum();

        Map<Integer, ForumUser> resultOfForum = azerothForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getNumberOfposts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("Number of users in a Map: " + resultOfForum.size());

        resultOfForum.entrySet().stream()
                .map(integerForumUserEntry -> integerForumUserEntry.getKey() + ":" + integerForumUserEntry.getValue())
                .forEach(System.out::println);


    }
}
