package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private double resultOfTaskExecution = 0;

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
            resultOfTaskExecution = quantity * 10;
        } else {
            resultOfTaskExecution = quantity * 2;
        }
    }

    @Override
    public boolean isTaskExecuted() {
        return resultOfTaskExecution > 12;
    }
}

