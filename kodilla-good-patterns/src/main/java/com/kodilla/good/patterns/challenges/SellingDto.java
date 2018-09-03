package com.kodilla.good.patterns.challenges;

public class SellingDto {
    private User user;
    private boolean isValid;
    private String information;

    public SellingDto(User user, boolean isValid, String information) {
        this.user = user;
        this.isValid = isValid;
        this.information = information;
    }

    public User getUser() {
        return user;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getInformation() {
        return information;
    }

}
