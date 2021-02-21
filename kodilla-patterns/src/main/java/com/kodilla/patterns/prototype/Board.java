package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Board extends Prototype<Board> {

    private String name;
    private Set<TaskList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TaskList> getLists() {
        return lists;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }
//    private Set<TaskList> lists = new HashSet<>();
    public Board deepCopy() throws CloneNotSupportedException {
        Board cloneBoard = super.clone();
        cloneBoard.lists = new HashSet<>();
        for (TaskList theList : lists) {
            TaskList cloneList = new TaskList(theList.getName());
            for (Task task : theList.getTasks()) {
                cloneList.getTasks().add(task);
            }
            cloneBoard.getLists().add(cloneList);
        }
        return cloneBoard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Board)) return false;

        Board board = (Board) o;

        if (getName() != null ? !getName().equals(board.getName()) : board.getName() != null) return false;
        return getLists() != null ? getLists().equals(board.getLists()) : board.getLists() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getLists() != null ? getLists().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Board{" +
                "name='" + name + '\'' +
                ", lists=" + lists +
                '}';
    }
}
