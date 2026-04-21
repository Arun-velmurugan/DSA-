
package exceptionhandling3;

import java.util.Scanner;

public class StudentMarks {
    static int marks;
    
//    static
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Marks: ");
//        studentMarks = sc.nextInt();
//    }
    
    static void enterMarks(Scanner sc) throws IllegalArgumentException
    {
        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
        
        try{
            if(marks<0||marks>100)
            {
                throw new IllegalArgumentException("Only valid marks should be displayed");
            }
//            else{
//                System.out.println("Marks: "+marks);
//            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    static void displayMarks()
    {
        System.out.println("Marks: "+marks);
    }
}
