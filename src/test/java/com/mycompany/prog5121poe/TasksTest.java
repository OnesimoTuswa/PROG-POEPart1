/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prog5121poe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author HP
 */
public class TasksTest {
    Tasks tasks = new Tasks();

    public TasksTest() {
    }

    @Test
    public void testAddTasks() {
    }

    @Test
    public void testCheckTaskDescription() {
        tasks.checkTaskDescription();
        boolean expected = true;
        boolean actuality = tasks.description;
        
        assertEquals(expected, actuality);
    }

    @Test
    public void testCreateTaskID() {
        tasks.createTaskID();
        String[] expected = {"LO:1:BYN"};
        String[] actuality = new String[1];
        
        for(int i = 0; i < tasks.numTasks; i++){
            actuality[i] = tasks.taskID[i];
        }
        
        assertEquals(expected[0], actuality[0]);
    }

    @Test
    public void testPrintTaskDetails() {
    }

    @Test
    public void testReturnTotalHours() {
        tasks.returnTotalHours();
        int expected = 18;
        int actuality = tasks.totalTaskDuration;
        
        assertEquals(expected, actuality);
    }
}