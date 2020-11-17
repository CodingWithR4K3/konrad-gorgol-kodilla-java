package com.kodilla.testing.forum.statistics;

public class StatisticsData {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (statistics.postsCount() == 0 || statistics.usersNames().size() == 0) {
            averagePostsPerUser = 0;
        } else {
            averagePostsPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
        }
        if (statistics.commentsCount() == 0 || statistics.usersNames().size() == 0) {
            averageCommentsPerUser = 0;
        } else {
            averageCommentsPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        }
        if (statistics.commentsCount() == 0 || statistics.postsCount() == 0)
            averageCommentsPerPost = 0;
        else {
            averageCommentsPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        }
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("------------------------------------------------------");
        System.out.println("Currently we have " + usersCount + " users registered.");
        System.out.println("Users have written " + postsCount + " posts so far.");
        System.out.println("Users have written " + commentsCount + " comments so far.");
        System.out.println("The average user has written " + averagePostsPerUser + " posts.");
        System.out.println("The average user has written " + averageCommentsPerUser + " comments.");
        System.out.println("On average each post had been commented " + averageCommentsPerPost + " times.");
        System.out.println("------------------------------------------------------");

    }
}