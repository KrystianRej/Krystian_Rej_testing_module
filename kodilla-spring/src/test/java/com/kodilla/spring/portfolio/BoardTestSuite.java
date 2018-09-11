package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addToToDoList("Kup");
        board.addToInProgressList("Ogladanie");
        board.addToDoneList("Narysowane");

        String toDoListTask = board.getToDoList().getTasks().get(0);
        String inProgressListTask = board.getInProgressList().getTasks().get(0);
        String doneListTask = board.getDoneList().getTasks().get(0);

        System.out.println( toDoListTask + " " + inProgressListTask + " " + doneListTask);

        Assert.assertEquals("Kup", toDoListTask);
        Assert.assertEquals("Ogladanie", inProgressListTask);
        Assert.assertEquals("Narysowane", doneListTask);
    }
}

