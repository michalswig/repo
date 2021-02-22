package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("JohnSmith");
        User user2 = new ZGeneration("AdamKill");
        User user3 = new YGeneration("JohnDoe");

        //When
        String user1Sharing = user1.sharePost();
        String user2Sharing = user2.sharePost();
        String user3Sharing = user3.sharePost();
        //Then
        assertEquals("I`m using Facebook", user1Sharing);
        assertEquals("Im using twitter", user2Sharing);
        assertEquals("Im using SnapChat", user3Sharing);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User user1 = new Millenials("JohnSmith");
        //When
        String user1Sharing = user1.sharePost();
        user1.setSocialPublisher(new TwitterPublisher());
        user1Sharing = user1.sharePost();
        //Then
        assertEquals("Im using twitter", user1Sharing);
    }
}
