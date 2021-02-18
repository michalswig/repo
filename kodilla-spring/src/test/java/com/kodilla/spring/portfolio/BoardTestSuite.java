package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private Board board;

    @Test
    public void testAddTaskListsToBoard(){
        //Given

        //When
        board.addToDoList("toDo");
        board.addInProgressList("inProgress");
        board.addDoneList("done");

        //Then
        Assertions.assertEquals(3,board.qntTasksInBoard());
        System.out.println("number of tasks in board: " + board.qntTasksInBoard());
    }
}
