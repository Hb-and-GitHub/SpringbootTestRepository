package com.hb.demo.config;


import java.util.Scanner;

public class StudentManagementSystem {
    public void FenShuOperation(int fenzi) throws IllegalAgeException {
        if (fenzi > 18 ){
            System.out.println(fenzi);
        }else {
            throw new IllegalAgeException();
        }
    }
    public static void main(String[] args) {

        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入年龄：");
            int fenzi = scanner.nextInt();
            studentManagementSystem.FenShuOperation(fenzi);

        } catch (IllegalArgumentException e) {

            e.printStackTrace();

        }

    }

}




