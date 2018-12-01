package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Task;

import java.util.Optional;

public class Mentor implements KodillaObserver {
    private final String mentorName;
    //counter for tests
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTasks studentTask) {
        Task task = studentTask.getTasks().get(studentTask.getTasks().size() - 1);
            System.out.println(mentorName + ": New task avaliable to check from student: " + studentTask.getStudentName() + "\n" +
                    " Taskname: " + task.getTaskname() + ", " +
                    " Modulename: " + task.getModuleName() + ", " +
                    " TaskID: " + task.getTaskId() +
                    " (total tasks: " + studentTask.getTasks().size() + ")");
            updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
