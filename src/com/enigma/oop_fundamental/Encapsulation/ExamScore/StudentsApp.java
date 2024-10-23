package com.enigma.oop_fundamental.Encapsulation.ExamScore;

import java.util.Scanner;

public class StudentsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        Students students = new Students(name);
        do {
            System.out.print("Add your score: ");
            int score = scanner.nextInt();
            students.addExamScore(score);
            System.out.println("Masukan lagi ? (y/n)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                break;
            }

        } while (true);
        students.getAverage();
        students.getStudentsInfo();
    }
}
