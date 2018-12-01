package com.kodilla.patterns2.observer.forum;

public class Task {
    private final String taskname;
    private final int taskId;
    private final String moduleName;

    public Task(String taskname, int taskId, String moduleName) {
        this.taskname = taskname;
        this.taskId = taskId;
        this.moduleName = moduleName;
    }

    public String getTaskname() {
        return taskname;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getModuleName() {
        return moduleName;
    }
}
