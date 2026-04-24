
package innerclasshomework;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institution.Student i1 = new Institution().new Student();
        
        
        boolean exit = true;
        
        do{
            System.out.println("1.Add Student");
            System.out.println("2.Add Marks");
            System.out.println("3.Calculate Grade");
            System.out.println("4.Display Student Details");
            System.out.println("5.Exit");
            System.out.print("Option: ");
            int option = sc.nextInt();
            if(option==1)
            {
                i1.addStudent();
            }
            else if(option==2)
            {
                i1.addMarks();
            }
            else if(option==3)
            {
                i1.calculateGrade();
            }
            else if(option==4)
            {
                i1.displayStudentDetails();
                i1.calculateGrade();
            }
            else
            {
                System.out.println("Exiting....");
                exit =false;
            }
        }while(exit);
    }
}
