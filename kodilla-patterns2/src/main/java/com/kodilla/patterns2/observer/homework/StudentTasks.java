package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Task;

import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements KodillaObservable{
    private final String studentName;
    private final List<Task> tasks;
    private final List<KodillaObserver> observers;

    public StudentTasks(String studentName) {
        this.studentName = studentName;
        this.tasks = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyMentor();
    }

    @Override
    public void registerMentor(KodillaObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyMentor() {
        for(KodillaObserver observer: observers) {
            observer.update(this);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
