package com.kodilla.spring.portfolio;



public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;


    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addToToDoList(String task){
        toDoList.getTasks().add(task);
    }
    public void addToInProgressList(String task){
        inProgressList.getTasks().add(task);
    }
    public void addToDoneList(String task){
        doneList.getTasks().add(task);
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
