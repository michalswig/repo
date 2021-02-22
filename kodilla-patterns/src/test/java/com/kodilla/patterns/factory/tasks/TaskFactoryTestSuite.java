package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testTaskShop() {
        //GIVEN
        TaskFactory taskFactory = new TaskFactory();
        //WHEN
        Task shopping = taskFactory.taskMaker(TaskFactory.SHOPPINGTASK);
        //THEN
        assertEquals(shopping.getClass(), ShoppingTask.class);
        shopping.executeTask();
        boolean isTaskDone =  shopping.isTaskExecuted();
        assertEquals(true, isTaskDone);
    }
    @Test
    void testTaskPaint(){
        //GIVEN
        TaskFactory taskFactory = new TaskFactory();
        //WHEN
        Task painting = taskFactory.taskMaker(TaskFactory.PAINTINGTASK);
        //THEN
        assertEquals(painting.getClass(), PaintingTask.class);
        painting.executeTask();
        boolean isTaskDone = painting.isTaskExecuted();
        assertEquals(true, isTaskDone);
    }
    @Test
    void testTaskDrive(){
        //GIVEN
        TaskFactory taskFactory = new TaskFactory();
        //WHEN
        Task driving = taskFactory.taskMaker(TaskFactory.DRIVINGTASK);
        //THEN
        assertEquals(driving.getClass(), DrivingTask.class);
        driving.executeTask();
        boolean isTaskDOne = driving.isTaskExecuted();
        assertEquals(true, isTaskDOne);
    }
}
