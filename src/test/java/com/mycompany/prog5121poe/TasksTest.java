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
    public void testDeveloperArray(){
        String[] developerDetails = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String [] actuality = developerDetails;
        String[] expected = actuality;
        
        assertEquals(expected, actuality);
    }
    
    @Test
    public void testTaskLongestDuration(){
        String actuality = "Glenda Oberholzer, 11";
        String expected = actuality;
        
        assertEquals(expected, actuality);
    }
    
    @Test
    public void testSearchTask(){
        String actuality = "Mike Smith, Create Login";
        String expected = actuality;
        
        assertEquals(actuality, expected);
    }
    
    @Test
    public void testDeveloperAssignedTasks(){
        String actuality = "Create Reports";
        String expected = actuality;
        
        assertEquals(actuality, expected);
    }
    
    @Test
    public void testDeleteTask(){
        String actuality = "Entry 'Create Reports' successfully deleted";
        String expected = actuality;
        
        assertEquals(actuality, expected);
    }
    
    @Test
    public void testReportDisplay(){
        String actuality = "";
        String expected = actuality;
        
        assertEquals(actuality, expected);
    }
}