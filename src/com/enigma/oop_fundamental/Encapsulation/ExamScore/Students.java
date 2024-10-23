package com.enigma.oop_fundamental.Encapsulation.ExamScore;
import java.util.ArrayList;

public class Students {
    final private String name;
    private ArrayList<Integer> examScore = new ArrayList<Integer>();
    private int averageScore = 0;

    public Students(String name) {
        this.name = name;
    }

    public void addExamScore(int score) {
        examScore.add(score);
    }
    public void getAverage(){
        for (Integer integer : examScore) {
            averageScore += integer;
        }
        averageScore = averageScore / examScore.size();
        System.out.println(averageScore);
    }
    public void getStudentsInfo(){
        System.out.println("Name: " + name+"  Average: " + averageScore);
    }
}
