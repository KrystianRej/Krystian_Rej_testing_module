package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final int publishedPosts;
    private final LocalDate dateOfBirth;

    public ForumUser(int userId, String userName, char sex, int publishedPosts,
                     int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.publishedPosts = publishedPosts;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    public char getSex() {
        return sex;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", publishedPosts=" + publishedPosts +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
