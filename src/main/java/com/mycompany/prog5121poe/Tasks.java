/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

import javax.swing.*;

/**
 *
 * @author HP
 */
public class Tasks extends Login{
    String option;
    String numTask;
    int numTasks;
    String[] taskName;
    String taskNameInput;
    int[] taskNumber;
    int taskNumberInput;
    String[] taskDescription;
    String descriptionInput;
    String[] developerDetails;
    String developerDetailsInputFirst;
    String developerDetailsInputLast;
    int[] taskDuration;
    String taskDurationInput;
    int taskDurationInputNum;
    String[] taskID;
    String taskIDFormat;
    String taskIdentification;
    String[] status;
    String todo = "To Do";
    String done = "Done";
    String doing = "Doing";
    String statusInput;
    int statusInputNum;
    
    public void addTasks(){
        Login login = new Login();
        

        if(login.loginuser == true)
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
            boolean eof = false;

            while(eof == false){
                option = JOptionPane.showInputDialog("Option 1: Add Tasks" + "\n" + "Option 2: Show report" + "\n" + "Option 3: Quit");
                int options = Integer.parseInt(option);

                switch(options){
                    case 1:
                        numTask = JOptionPane.showInputDialog("How many tasks would you like to add?");
                        numTasks = Integer.parseInt(numTask);
                        taskName = new String[numTasks];
                        taskNumber = new int[numTasks];
                        taskDescription = new String[numTasks];
                        developerDetails = new String[numTasks];
                        taskDuration = new int[numTasks];
                        taskID = new String[numTasks];
                        status = new String[numTasks];

                        for(int i = 0; i < numTasks; i++){
                            taskNameInput = JOptionPane.showInputDialog("Enter the name of the task.");
                            taskName[i] = taskNameInput;
                            taskNumberInput = i + 1;
                            taskNumber[i] = taskNumberInput;
                            descriptionInput = JOptionPane.showInputDialog("Enter a short description of the task.");
                            taskDescription[i] = descriptionInput;
                            developerDetailsInputFirst = JOptionPane.showInputDialog("Enter first name of the developer assigned to the task.");
                            developerDetailsInputLast = JOptionPane.showInputDialog("Enter last name of the developer assigned to the task.");
                            developerDetails[i] = developerDetailsInputFirst + " " + developerDetailsInputLast;
                            taskDurationInput = JOptionPane.showInputDialog("Enter the estimated duration of the task in hours");
                            taskDurationInputNum = Integer.parseInt(taskDurationInput);
                            taskDuration[i] = taskDurationInputNum;
                            statusInput = JOptionPane.showInputDialog("Select task status from the following.\n Option 1: To Do \n Option 2: Doing \n Option 3: Done");
                            statusInputNum = Integer.parseInt(statusInput);
                            switch (statusInputNum) {
                                case 1:
                                    status[i] = todo;
                                    break;
                                case 2:
                                    status[i] = done;
                                    break;
                                case 3:
                                    status[i] = doing;
                                    break;
                            }
                            taskIDFormat = taskNameInput.charAt(0) + taskNameInput.charAt(1) + ":" + taskNumberInput + ":" + developerDetailsInputFirst.charAt(developerDetailsInputFirst.length() - 3) + developerDetailsInputFirst.charAt(developerDetailsInputFirst.length() - 2) + developerDetailsInputFirst.charAt(developerDetailsInputFirst.length() - 1);
                            taskIdentification = taskIDFormat.toUpperCase();
                            taskID[i] = taskIdentification;
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Coming Soon");
                        break;
                    case 3:
                        eof = true;
                        break;
                }
            
        }
    }
    
    boolean description;
    
    public void checkTaskDescription(){
        boolean condition = false;
        
        while(condition == false){
            descriptionInput = JOptionPane.showInputDialog("Enter a short description of the task.");
            
            if(descriptionInput.length() > 50){
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                description = false;
            }
            else{
                JOptionPane.showMessageDialog(null, "Task successfully captured");
                description = true;
                condition = true;
            }
        }
    }
    
    public void createTaskID(){
        numTask = JOptionPane.showInputDialog("How many tasks would you like to add?");
        numTasks = Integer.parseInt(numTask);
        taskName = new String[numTasks];
        taskNumber = new int[numTasks];
        developerDetails = new String[numTasks];
        taskID = new String[numTasks];

        for(int i = 0; i < numTasks; i++){
        taskNameInput = JOptionPane.showInputDialog("Enter the name of the task.");
        taskName[i] = taskNameInput;
        taskNumberInput = i + 1;
        taskNumber[i] = taskNumberInput;
        developerDetailsInputFirst = JOptionPane.showInputDialog("Enter first name of the developer assigned to the task.");
        developerDetails[i] = developerDetailsInputFirst;  
        
        taskIDFormat = "" + taskNameInput.charAt(0) + taskNameInput.charAt(1) + ":" + taskNumberInput + ":" + developerDetailsInputFirst.charAt(developerDetailsInputFirst.length() - 3) + developerDetailsInputFirst.charAt(developerDetailsInputFirst.length() - 2) + developerDetailsInputFirst.charAt(developerDetailsInputFirst.length()-1);
        taskIdentification = taskIDFormat.toUpperCase();
        taskID[i] = taskIdentification;
        }
    }
    
    public void printTaskDetails(){
        for(int i = 0; i < numTasks; i++){
            JOptionPane.showMessageDialog(null, "Task Status: " + status[i] + "\n" + "Developer Details: " + developerDetails[i] + "\n" + "Task Number: " + taskNumber[i] + "\n" + "Task Name: " + taskName[i] + "\n" + "Task Description: " +taskDescription[i] + "\n" + "Task ID: " + taskID[i] + "\n" + "Task Duration: " + taskDuration[i]);
        }
    }

    int totalTaskDuration = 0;
    public void returnTotalHours(){
        numTask = JOptionPane.showInputDialog("How many tasks would you like to add?");
        numTasks = Integer.parseInt(numTask);
        taskDuration = new int[numTasks];
        
        for(int i = 0; i < numTasks; i++){
            taskDurationInput = JOptionPane.showInputDialog("Enter the estimated duration of the task in hours");
            taskDurationInputNum = Integer.parseInt(taskDurationInput);
            taskDuration[i] = taskDurationInputNum;
            totalTaskDuration += taskDuration[i];
        }
        JOptionPane.showMessageDialog(null, totalTaskDuration);
    }
}