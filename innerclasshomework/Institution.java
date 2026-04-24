
package innerclasshomework;

import java.util.Scanner;


public class Institution {
    
    Scanner sc = new Scanner(System.in);
    static String institutionName = "Sathya Saai";
    
    class Student{
        String studentName;
        int rollNo;
        int noOfSub;
        int marks[];
        double average;
        //char grade;
        
        
    void addStudent(){
       
        System.out.print("Name: ");
        studentName = sc.nextLine();
        
        System.out.print("Roll No: ");
        rollNo = sc.nextInt();
        
         System.out.print("No.Of.Sub: ");
         noOfSub = sc.nextInt();
         marks = new int[noOfSub];
    }
//        System.out.print("Roll No: ");
//        rollNo = sc.nextInt();
//        
//       
        int count = 1;
    void addMarks(){
            for(int i=0;i<marks.length;i++)
            {
                System.out.print("Enter Marks "+count+": ");
                marks[i] = sc.nextInt();
                count++;
            }
    }
    double calculateAvg()
    {
        average = 0;
        for (int i = 0; i <noOfSub; i++) {
            average = average+marks[i];
        }
        return average/noOfSub;
    }
    
    String calculateGrade()
    {
            double avg = calculateAvg();
            if(avg>=90 && avg<=100)
            {
                return "Grade A";
            }
            else if(avg >=75 && avg<90)
            {
                return  "Grade B";
            }
            else if(avg>=50 && avg<75)
            {
                return "Grade C";
            } 
        return "Fail";
    }
        
       
    void displayStudentDetails()
    {
        System.out.println("Institution Name: "+institutionName);
        System.out.println("Student Name: "+ studentName);
        System.out.println("Roll No: "+rollNo);
        System.out.print("Marks: " );
        for (int i = 0; i <noOfSub; i++) {
             System.out.print(marks[i]+" ");
        }
        System.out.println("");
        System.out.println("Average: "+calculateAvg()); 
        
        System.out.println("Grade: "+calculateGrade());
    }
  }
        
 }

