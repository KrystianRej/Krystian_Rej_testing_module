package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenialUser = new Millenials("Marian");
        User yGenUser = new YGeneration("Kowalik");
        User zGenUser = new ZGeneration("Pogba55");

        //When
        String millenial = millenialUser.sharePost();
        System.out.println(millenial);
        String yGen = yGenUser.sharePost();
        System.out.println(yGen);
        String zGen = zGenUser.sharePost();
        System.out.println(zGen);

        //Then
        Assert.assertEquals("Facebook", millenial);
        Assert.assertEquals("Twitter", yGen);
        Assert.assertEquals("Snapchat", zGen);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenialUser = new Millenials("Marian");

        //When
        String millenial = millenialUser.sharePost();
        System.out.println(millenial);
        millenialUser.changeDefaultPublisher(new TwitterPublisher());
        millenial = millenialUser.sharePost();
        System.out.println(millenial);

        //Then
        Assert.assertEquals("Twitter", millenial);
    }
}
