package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean resultOfTaskExecution;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public void executeTask() {
        if(whatToBuy.length() <= 10) {
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

