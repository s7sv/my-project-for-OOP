package project2;

import java.util.ArrayList;

public class grades extends Student { //gpa

    public static ArrayList<String> signs = new ArrayList<>(); //here we wil collect the whole signs
    public static ArrayList<Double> markrate = new ArrayList<>();   //here we will add the huors rate 

    public double Grades;              //this for the grades from the user 
    public String sign;            //here we will add the sing from the if statement
    public double average;

    public void condition() {
        if (Grades >= 95) {
            sign = "A+";
            average = 4;

        } else if (Grades >= 90) {
            sign = "A";
            average = 3.75;

        } else if (Grades >= 85) {
            sign = "B+";
            average = 3.50;

        } else if (Grades >= 80) {
            sign = "B";
            average = 3;

        } else if (Grades >= 75) {
            sign = "C+";
            average = 2.50;

        } else if (Grades >= 70) {
            sign = "C";
            average = 2;

        } else if (Grades >= 65) {
            sign = "D+";
            average = 1.50;

        } else if (Grades >= 60) {
            sign = "D";
            average = 1;

        } else {
            sign = "F";
            average = 0;

        }
    }

}
