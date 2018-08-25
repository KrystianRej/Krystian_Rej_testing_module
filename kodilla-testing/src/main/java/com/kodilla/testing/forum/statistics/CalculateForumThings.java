package com.kodilla.testing.forum.statistics;

public class CalculateForumThings {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avergaeNumberOfPostsPerUser;
    private double avergaeNumberOfCommentsPerUser;
    private double avergaeNumberOfCommentsPerPost;
    public void calculateAdvStatistics(Statistics statistics)
    {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUsers > 0) {
            avergaeNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
            avergaeNumberOfCommentsPerUser = numberOfComments/numberOfUsers;
        } else {
            avergaeNumberOfPostsPerUser = 0;
            avergaeNumberOfCommentsPerUser = 0;
        }
        if(numberOfPosts > 0){
            avergaeNumberOfCommentsPerPost = numberOfComments/numberOfPosts;
        } else {
            avergaeNumberOfCommentsPerPost = 0;
        }

    }
    public String showStatistics()
    {
        return   "" + numberOfUsers + numberOfPosts  + numberOfComments
                        + avergaeNumberOfPostsPerUser + avergaeNumberOfCommentsPerUser
                            + avergaeNumberOfCommentsPerPost;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvergaeNumberOfPostsPerUser() {
        return avergaeNumberOfPostsPerUser;
    }

    public double getAvergaeNumberOfCommentsPerUser() {
        return avergaeNumberOfCommentsPerUser;
    }

    public double getAvergaeNumberOfCommentsPerPost() {
        return avergaeNumberOfCommentsPerPost;
    }
}
