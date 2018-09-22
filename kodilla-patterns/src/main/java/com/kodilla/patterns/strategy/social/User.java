package com.kodilla.patterns.strategy.social;

public class User {
    private String username;
    protected SocialPublisher publisher;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public String sharePost() {
        return publisher.share();
    }
    public void changeDefaultPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }
}
