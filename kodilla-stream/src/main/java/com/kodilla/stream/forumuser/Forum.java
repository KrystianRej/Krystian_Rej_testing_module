package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    List <ForumUser> userList = new ArrayList<>();

    public Forum()
    {
        userList.add(new ForumUser(1 , "Maciek123", 'M', 32,
                1995,12, 21));
        userList.add(new ForumUser(2 , "Ania22", 'K', 56,
                2000,12, 23));
        userList.add(new ForumUser(3 , "Karol23", 'M', 0,
                1992,9, 30));
        userList.add(new ForumUser(4 , "xXtytusXx", 'M', 56,
                1996,2, 1));
        userList.add(new ForumUser(5 , "JosephD", 'M', 12,
                2009,12, 3));
        userList.add(new ForumUser(6 , "Moo22", 'M', 6,
                1990,3, 8));
        userList.add(new ForumUser(7 , "Polak1410", 'K', 10,
                1996,2, 3));
        userList.add(new ForumUser(8 , "PanKot", 'M', 32,
                1993,8, 3));

    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
