package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String txt){
        tasks.add(txt);
    }
    public int qntTask(){ return tasks.size();}
}
