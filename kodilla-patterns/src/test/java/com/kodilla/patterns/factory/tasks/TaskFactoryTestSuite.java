package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task newTask = factory.chooseTask(TaskFactory.SHOPPINGTASK);
        newTask.executeTask();
        //Then
        Assert.assertEquals(true, newTask.isTaskExecuted());
        Assert.assertEquals("Shopping", newTask.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task newTask = factory.chooseTask(TaskFactory.PAINTINGTASK);
        newTask.executeTask();
        //Then
        Assert.assertEquals(true, newTask.isTaskExecuted());
        Assert.assertEquals("Painting", newTask.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task newTask = factory.chooseTask(TaskFactory.DRIVINGTASK);
        newTask.executeTask();
        //Then
        Assert.assertEquals(false, newTask.isTaskExecuted());
        Assert.assertEquals("Driving", newTask.getTaskName());
    }
}
