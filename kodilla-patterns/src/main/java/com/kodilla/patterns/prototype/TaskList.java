package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final String name;
    private final List<Task> tasks = new ArrayList<>();

    public TaskList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for (Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskList)) return false;

        TaskList taskList = (TaskList) o;

        if (getName() != null ? !getName().equals(taskList.getName()) : taskList.getName() != null) return false;
        return getTasks() != null ? getTasks().equals(taskList.getTasks()) : taskList.getTasks() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getTasks() != null ? getTasks().hashCode() : 0);
        return result;
    }
}
