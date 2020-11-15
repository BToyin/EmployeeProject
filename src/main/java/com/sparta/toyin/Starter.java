package com.sparta.toyin;

import com.sparta.toyin.Controller.EmployeeDAO;
import com.sparta.toyin.Model.EmployeeDTO;
import com.sparta.toyin.Model.ReadFile;

import java.util.HashMap;

public class Starter {

    static HashMap<String, EmployeeDTO> input = ReadFile.readFile();

    public static void start() {

        HashMap<String, EmployeeDTO> input = ReadFile.readFile();
        Task task = new Task();
        int numOfThreads = 2;
        for (int i = 0;i<numOfThreads;i++) {
            // separate the hashmap so you're not passing the whole file to each thread
            // split hashmap into a smaller hashmaps - 
            Thread thread = new Thread(task,String.valueOf(i));
            thread.start();
        }
    }
}
