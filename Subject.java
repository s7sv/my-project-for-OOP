package project2;

import java.util.*;
import static project2.grades.markrate;
import static project2.grades.signs;

public class Subject extends grades{
     private int Huors;
    private double Gba;
    private double point;

    public String subjectName;
    public int numberOfsub;
    public static ArrayList<String> subject = new ArrayList<>(); //here we will add suject
    public static ArrayList<Integer> Ahuors=new ArrayList<>();
    
    
    
    
    


    public void addsubject() {
        //هنا ناخذ عدد مواد الطالب ودرجاتها وساعاتها
        System.out.println("how many subject do you have?");
        numberOfsub = s.nextInt();
        for (int i = 1; i <= numberOfsub; i++) {
            System.out.println("please enter subject number " + i + ":");
            subjectName = s.next();
            

            subject.add(subjectName);
            addgrade();
            

        }
    

        
    }
    public void addgrade(){
        //هنا عملية ادخال الدرجة والساعات خليتها منفصلة واستدعيتها فوق 
        
            System.out.println("please enter Grade of subject :");
            Grades = s.nextInt();
            System.out.println("enter hoers:");
            Huors=s.nextInt();
            condition();
            signs.add(sign);
            markrate.add(average);
            Ahuors.add(Huors);
            
        
        

    }
    public void mark(){
        //هنا عملية حساب المعدل
        
        Huors=0;
        for (int i = 0; i < numberOfsub; i++) {
            System.out.print(subject.get(i)+": ");
            System.out.println(signs.get(i));
            Huors+=Ahuors.get(i);
            point+=markrate.get(i)*Ahuors.get(i);
            

            
        }
        System.out.println("your point now is: "+point+" from huors: "+Huors);
        Gba=(point/Huors);
        System.out.println(" your rate is: "+Gba);
        
    }
    

}

 