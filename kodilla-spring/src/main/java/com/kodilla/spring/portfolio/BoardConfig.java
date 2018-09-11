package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("task1")
    TaskList task;
    @Autowired
    @Qualifier("task2")
    TaskList task2;
    @Autowired
    @Qualifier("task3")
    TaskList task3;

    @Bean(name = "task1")
    @Scope("prototype")
    public TaskList toDoList(){
        return new TaskList();
    }

    @Bean(name = "task2")
    @Scope("prototype")
    public TaskList inProgressList(){
        return new TaskList();
    }

    @Bean(name = "task3")
    @Scope("prototype")
    public TaskList doneList(){
        return new TaskList();
    }

    @Bean
    public Board completeTheTasks(){
        return new Board(task, task2, task3);
    }

}
