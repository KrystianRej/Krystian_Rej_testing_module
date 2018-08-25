package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateForumThingsTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest()
    {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void after()
    {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("Test Suite: begin");
    }

    @Test
    public void testCalculateAdvStatistics()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();
        for(int i = 0; i<100; i++)
        {
            testList.add("Ania" + i);
        }
        when(statistics.usersNames()).thenReturn(testList);
        int listSize = testList.size();
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(0, newCollection.getNumberOfPosts());
        Assert.assertEquals(0,newCollection.getNumberOfComments());
        Assert.assertEquals(0, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
    }
    @Test
    public void testCalculateAdvStatistics2()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testListEmpty = new ArrayList<String>();
        when(statistics.usersNames()).thenReturn(testListEmpty);
        int listSize = testListEmpty.size();
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(0, newCollection.getNumberOfPosts());
        Assert.assertEquals(0,newCollection.getNumberOfComments());
        Assert.assertEquals(0, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
    }
    @Test
    public void testCalculateAdvStatistics3()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testListEmpty = new ArrayList<String>();
        when(statistics.usersNames()).thenReturn(testListEmpty);
        int listSize = testListEmpty.size();
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(1000, newCollection.getNumberOfPosts());
        Assert.assertEquals(0,newCollection.getNumberOfComments());
        Assert.assertEquals(0, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
    }
    @Test
    public void testCalculateAdvStatistics4()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testListEmpty = new ArrayList<String>();
        when(statistics.usersNames()).thenReturn(testListEmpty);
        int listSize = testListEmpty.size();
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(1000, newCollection.getNumberOfPosts());
        Assert.assertEquals(100,newCollection.getNumberOfComments());
        Assert.assertEquals(0, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(0.1,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
    }
    @Test
    public void testCalculateAdvStatistics5()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testListEmpty = new ArrayList<String>();
        when(statistics.usersNames()).thenReturn(testListEmpty);
        int listSize = testListEmpty.size();
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(1000);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(100, newCollection.getNumberOfPosts());
        Assert.assertEquals(1000,newCollection.getNumberOfComments());
        Assert.assertEquals(0, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(10,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
    }
    @Test
    public void testCalculateAdvStatistics6()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testListEmpty = new ArrayList<String>();
        when(statistics.usersNames()).thenReturn(testListEmpty);
        int listSize = testListEmpty.size();
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(1000);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(0, newCollection.getNumberOfPosts());
        Assert.assertEquals(1000,newCollection.getNumberOfComments());
        Assert.assertEquals(0, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
    }
    @Test
    public void testCalculateAdvStatistics7()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();

        for(int i = 0; i<100; i++)
        {
            testList.add("Ania" + i);
        }
        when(statistics.usersNames()).thenReturn(testList);
        int listSize = testList.size();
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(1000, newCollection.getNumberOfPosts());
        Assert.assertEquals(0,newCollection.getNumberOfComments());
        Assert.assertEquals(10, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
    }
    @Test
    public void testCalculateAdvStatistics8()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();

        for(int i = 0; i<100; i++)
        {
            testList.add("Ania" + i);
        }
        when(statistics.usersNames()).thenReturn(testList);
        int listSize = testList.size();
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(1000, newCollection.getNumberOfPosts());
        Assert.assertEquals(100,newCollection.getNumberOfComments());
        Assert.assertEquals(10, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(1,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(0.1,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
    }
    @Test
    public void testCalculateAdvStatistics9()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();

        for(int i = 0; i<100; i++)
        {
            testList.add("Ania" + i);
        }
        when(statistics.usersNames()).thenReturn(testList);
        int listSize = testList.size();
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(1000);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(100, newCollection.getNumberOfPosts());
        Assert.assertEquals(1000,newCollection.getNumberOfComments());
        Assert.assertEquals(1, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(10,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(10,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
    }
    @Test
    public void testCalculateAdvStatistics10()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();

        for(int i = 0; i<100; i++)
        {
            testList.add("Ania" + i);
        }
        when(statistics.usersNames()).thenReturn(testList);
        int listSize = testList.size();
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(1000);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(0, newCollection.getNumberOfPosts());
        Assert.assertEquals(1000,newCollection.getNumberOfComments());
        Assert.assertEquals(0, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(10,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
    }
    @Test
    public void testShowStatistics()
    {
        Statistics statistics = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();

        for(int i = 0; i<100; i++)
        {
            testList.add("Ania" + i);
        }
        when(statistics.usersNames()).thenReturn(testList);
        int listSize = testList.size();
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(1000);
        CalculateForumThings newCollection = new CalculateForumThings();
        newCollection.calculateAdvStatistics(statistics);
        String allElements = newCollection.showStatistics();
        String expectedElements = "" + "100010000.010.00.0";

        //Then
        Assert.assertEquals(listSize, newCollection.getNumberOfUsers());
        Assert.assertEquals(0, newCollection.getNumberOfPosts());
        Assert.assertEquals(1000,newCollection.getNumberOfComments());
        Assert.assertEquals(0, newCollection.getAvergaeNumberOfPostsPerUser(),0.1);
        Assert.assertEquals(10,newCollection.getAvergaeNumberOfCommentsPerUser(),0.1);
        Assert.assertEquals(0,newCollection.getAvergaeNumberOfCommentsPerPost(),0.1);
        Assert.assertEquals(expectedElements, allElements);
    }







}
