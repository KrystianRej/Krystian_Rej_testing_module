package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean resultOfTaskExecution;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        if(where.length() != using.length()) {
            resultOfTaskExecution = true;
        } else {
            resultOfTaskExecution = false;
        }
    }

    @Override
    public boolean isTaskExecuted() {
        return this.resultOfTaskExecution;
    }
}
