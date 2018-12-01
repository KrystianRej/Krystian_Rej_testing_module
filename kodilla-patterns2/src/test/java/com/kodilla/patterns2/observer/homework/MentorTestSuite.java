package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Task;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTasks marianizworskitasks = new StudentTasks("Kolejka Mariana Izworskiego ");
        StudentTasks adriankowalskitasks = new StudentTasks("Kolejka Adriana Kowalskiego ");
        StudentTasks ricardokakatasks = new StudentTasks("Kolejka Ricardo Kaki ");
        StudentTasks jakisstudenttasks = new StudentTasks("Kolejka Jakiegos Studenta ");
        Mentor pawelpluta = new Mentor("Pawel Pluta");
        Mentor zinedinezidane = new Mentor("Zinedine Zidane");
        marianizworskitasks.registerMentor(pawelpluta);
        adriankowalskitasks.registerMentor(pawelpluta);
        ricardokakatasks.registerMentor(zinedinezidane);
        jakisstudenttasks.registerMentor(zinedinezidane);
        //When
        marianizworskitasks.addTask(new Task("program do dekorowania pizzy", 15487, "kodilla_patterns_2"));
        marianizworskitasks.addTask(new Task("fasada kosciola", 15488, "kodilla_patterns_2"));
        adriankowalskitasks.addTask(new Task("kalulator", 15310, "kodilla_basics"));
        ricardokakatasks.addTask(new Task("stworzenie beana", 15244, "kodilla_spring_basics"));
        jakisstudenttasks.addTask(new Task("program do obslugi forum", 15788, "kodilla_patterns"));
        //Then
        assertEquals(3,  pawelpluta.getUpdateCount());
        assertEquals(2, zinedinezidane.getUpdateCount());
    }
}
