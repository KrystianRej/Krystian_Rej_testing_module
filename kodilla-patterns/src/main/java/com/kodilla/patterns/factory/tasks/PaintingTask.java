package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean resultOfTaskExecution;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        if(color.toCharArray()[0] == whatToPaint.toCharArray()[0]) {
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
