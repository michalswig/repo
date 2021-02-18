package com.kodilla.spring.portfolio;


public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addToDoList(String task){
        toDoList.addTask(task);
    }
    public void addInProgressList(String task){
        inProgressList.addTask(task);
    }
    public void addDoneList(String task){
        doneList.addTask(task);
    }

    public int qntTasksInBoard(){
        return doneList.qntTask() + inProgressList.qntTask() + doneList.qntTask();
    }
}
