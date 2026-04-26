
package javaapplication6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class JavaApplication6 {

    Scanner sc = new Scanner(System.in);
   List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        
        JavaApplication6 j6 = new JavaApplication6();

        
        Scanner sc = new Scanner(System.in);
       
        
        boolean exit = true;
        do{
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6.Exit");
            
            System.out.print("Option: ");
            int option = sc.nextInt();
            
            switch(option){
                case 1:
                {
                    j6.addStudent();
                    break;
                }
                case 2:
                {
                    j6.viewStudent();
                    break;
                }
                case 3:
                {
                    j6.searchStudent();
                    break;
                }
                case 4:
                {
                    j6.updateMarks();
                    break;
                }
                case 5:
                {
                    j6.removeStudent();
                    break;
                }
                case 6:
                {
                    System.out.println("Exiting...");
                }
                default:
                {
                    exit = false;
                }
            }
            
        }while(exit);
        
    }
    
    void addStudent()
    {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        
        for(Student s: students)
        {
            if(s.rollNo==roll)
            {
                System.out.println("ROLL NO IS ALREADY EXIST");
                return;
            }
        }
        
        sc.nextLine();
        System.out.print("Enter The Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Student's Age: ");
        int age = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        
        students.add(new Student(roll,name,age,course,marks));
        
        System.out.println("Student Added Successfully");
    }
    
    void viewStudent()
    {
        if(students.isEmpty()){
            System.out.println("Students not found");
        }
        
        for(Student s:students)
        {
            s.display();
        }
    }
    
    void searchStudent()
    {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        
        for(Student s: students)
        {
            if(s.rollNo==roll){
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }
 
    void updateMarks()
    {
        System.out.print("Enter RollNo: ");
        int roll = sc.nextInt();
        
        for(Student s:students)
        {
            if(s.rollNo==roll)
            {
                System.out.print("Enter new mark: ");
                s.marks = sc.nextDouble();
                System.out.println("Marks Updated!");
                return;
            }
        }
        System.out.println("Student not found");
    }
    
    void removeStudent()
    {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        
        Iterator<Student> it = students.iterator();
        
        while(it.hasNext()){
            Student s = it.next();
            if(s.rollNo==roll)
            {
                it.remove();
                System.out.println("Student deleted!");
                return;
            }
                
        }
        System.out.println("Student not found.");
    }
}
