package project2;

import java.util.*;

public class Student {

    private static String studentname;
    private static String university;
    private static String IDNumber;
    Scanner s = new Scanner(System.in);

    public static ArrayList<String> studentInfo = new ArrayList<>();

    public void studentInfo() { 
//هنا طبعا راح ناخذ معلومات المستخدم ونخزنها
        System.out.println("Welcome to your study assistant,\nwho will help you calculate your semester average and cumulative average,\nand will also help you record your exam dates.\nBut first, let's start with your name so that I can serve you better:");
        studentname = s.nextLine();
        System.out.println("Now " + studentname + " which university do you study in?");
        university = s.nextLine();
        System.out.println("wow, " + university + "!! Good Choice \nEnter your ID Number:");
        IDNumber = s.nextLine();
    }

    public static void enterInfo() {
        //ونخزن المعلومات هنا في ارراي 
        studentInfo.add(studentname);
        studentInfo.add(university);
        studentInfo.add(IDNumber);

        System.out.println("name:" + studentInfo.get(0) + "\n" + "university:" + studentInfo.get(1));
        System.out.println("ID Number:" + studentInfo.get(2));

    }

}
