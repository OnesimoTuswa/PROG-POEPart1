/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author HP
 */
public class Tasks extends Login{
    String option;
    String numTask;
    int numTasks = 4;
    String[] taskName = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
    String taskNameInput;
    int[] taskNumber = {1, 2, 3, 4};
    int taskNumberInput;
    String[] taskDescription;
    String descriptionInput;
    String[] developerDetails = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
    String developerDetailsInputFirst;
    String[] developerDetailsFirst = {"Mike", "Edward", "Samantha", "Glenda"};
    String developerDetailsInputLast;
    int[] taskDuration = {5, 8, 2, 11};
    String taskDurationInput;
    int taskDurationInputNum;
    String[] taskID;
    String taskIDFormat;
    String taskIdentification;
    String todo = "To Do";
    String done = "Done";
    String doing = "Doing";
    String statusInput;
    int statusInputNum;
    String[] status = {todo, doing, done, todo};
    
    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public void addTasks(){
        Login login = new Login();
        
        if(login.loginuser == true)
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
            boolean eof = false;

            while(eof == false){
                option = JOptionPane.showInputDialog("""
                                                     Option 1: Add Tasks
                                                     Option 2: Complete Tasks
                                                     Option 3: Task with the longest duration
                                                     Option 4: Search for Task
                                                     Option 5: Search for Developer
                                                     Option 6: Delete Task
                                                     Option 7: Show report
                                                     Option 8: Quit""");
                int options = Integer.parseInt(option);

                switch(options){
                    case 1:
                        numTask = JOptionPane.showInputDialog("How many tasks would you like to add?");
                        numTasks = Integer.parseInt(numTask);
                        taskName = new String[numTasks];
                        taskNumber = new int[numTasks];
                        taskDescription = new String[numTasks];
                        developerDetailsFirst = new String[numTasks];
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
                            developerDetailsFirst[i] = developerDetailsInputFirst;
                            developerDetailsInputLast = JOptionPane.showInputDialog("Enter last name of the developer assigned to the task.");
                            developerDetails[i] = developerDetailsInputFirst + " " + developerDetailsInputLast;
                            taskDurationInput = JOptionPane.showInputDialog("Enter the estimated duration of the task in hours");
                            taskDurationInputNum = Integer.parseInt(taskDurationInput);
                            taskDuration[i] = taskDurationInputNum;
                            statusInput = JOptionPane.showInputDialog("Select task status from the following.\n Option 1: To Do \n Option 2: Done \n Option 3: Doing");
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
                        }
                        break;
                    case 2:
                        for(int i = 0; i < numTasks; i++){
                            if(status[i] == done){
                                JOptionPane.showMessageDialog(null, developerDetails[i]);
                                JOptionPane.showMessageDialog(null, taskName[i]);
                                JOptionPane.showMessageDialog(null, taskDuration[i]);
                            }
                        }
                        break;
                    case 3:
                        int maxDuration = 0;
                        for(int i = 0; i < taskDuration.length; i++){
                            if(taskDuration[i] > maxDuration){
                                maxDuration = taskDuration[i];
                            }
                        }
                        
                        for(int i = 0; i < numTasks; i++){
                            if(maxDuration == taskDuration[i]){
                                JOptionPane.showMessageDialog(null, developerDetails[i]+ "\n" + taskDuration[i]);
                            }
                        }
                        break;
                    case 4:
                        String taskSearch = JOptionPane.showInputDialog("Enter the name of the task you would like to search for.");
                        for(int i = 0; i < numTasks; i++){
                            if(taskSearch == taskName[i]){
                                JOptionPane.showMessageDialog(null, taskName[i] + "\n" + developerDetails[i] + "\n" + status[i]);
                            }
                        }
                        break;
                    case 5:
                        String developerSearch = JOptionPane.showInputDialog("Enter the name of the developer to search for all tasks assigned to them.");
                        for(int i = 0; i < numTasks; i++){
                            if(developerSearch == developerDetails[i]){
                                JOptionPane.showMessageDialog(null, taskName[i] + "\n" + status[i]);
                            }
                        }
                        break;
                    case 6:
                        String taskDelete = JOptionPane.showInputDialog("Enter the name of the task you would like to delete.");
                        
                        ArrayList<String> taskNameList = new ArrayList<>(Arrays.asList(taskName));
                        ArrayList<Integer> taskNumberList = new ArrayList<>(Arrays.asList());
                        for(int i:taskNumber){
                            taskNumberList.add(i);
                        }
                        ArrayList<String> taskDescriptionList = new ArrayList<>(Arrays.asList(taskDescription));
                        ArrayList<String> developerDetailsList = new ArrayList<>(Arrays.asList(developerDetails));
                        ArrayList<Integer> taskDurationList = new ArrayList<>(Arrays.asList());
                        for(int i:taskDuration){
                            taskDurationList.add(i);
                        }
                        ArrayList<String> statusList = new ArrayList<>(Arrays.asList(status));
                        int taskIndex = taskNameList.indexOf(taskDelete);
                        
                        if(taskNameList.contains(taskDelete)){
                            taskNameList.remove(taskDelete);
                            taskNumberList.remove(taskIndex);
                            taskDescriptionList.remove(taskIndex);
                            developerDetailsList.remove(taskIndex);
                            taskDurationList.remove(taskIndex);
                            statusList.remove(taskIndex);
                        }
                        break;
                    case 7:
                        for(int i = 0; i < numTasks; i++){
                            JOptionPane.showMessageDialog(null, "Task Status: " + status[i] + "\n" + "Developer Details: " + developerDetails[i] + "\n" + "Task Number: " + taskNumber[i] + "\n" + "Task Name: " + taskName[i] + "\n" + "Task Duration: " + taskDuration[i] + " hours");
                        }
                        break;
                    case 8:
                        eof = true;
                        break;
                }
            }
    }
    
    boolean description;
    
    public void checkTaskDescription(){
        boolean condition = false;
        
        for(int i = 0; i < numTasks; i++){
            if(taskDescription[i].length() > 50){
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                description = false;
                descriptionInput = JOptionPane.showInputDialog("Enter a short description of the task.");
                taskDescription[i] = descriptionInput;
            }
            else{
                JOptionPane.showMessageDialog(null, "Task successfully captured");
                description = true;
                condition = true;
            }
        }
    }
    
    public void createTaskID(){
        
        for(int i = 0; i < numTasks; i++){     
            
            taskIDFormat = "" + taskName[i].charAt(0) + taskName[i].charAt(1) + ":" + taskNumber[i] + ":" + developerDetailsFirst[i].charAt(developerDetailsFirst[i].length() - 3) + developerDetailsFirst[i].charAt(developerDetailsFirst[i].length() - 2) + developerDetailsFirst[i].charAt(developerDetailsFirst[i].length()-1);
            taskIdentification = taskIDFormat.toUpperCase();
            taskID[i] = taskIdentification;
            JOptionPane.showMessageDialog(null, taskID[i]);
        }
    }
    
    public void printTaskDetails(){
        for(int i = 0; i < numTasks; i++){
            JOptionPane.showMessageDialog(null, "Task Status: " + status[i] + "\n" + "Developer Details: " + developerDetails[i] + "\n" + "Task Number: " + taskNumber[i] + "\n" + "Task Name: " + taskName[i] + "\n" + "Task Description: " +taskDescription[i] + "\n" + "Task ID: " + taskID[i] + "\n" + "Task Duration: " + taskDuration[i] + " hours");
        }
    }

    int totalTaskDuration = 0;
    public void returnTotalHours(){
        
        for(int i = 0; i < numTasks; i++){
            totalTaskDuration += taskDuration[i];
        }
        JOptionPane.showMessageDialog(null, totalTaskDuration + " hours");
    }
}