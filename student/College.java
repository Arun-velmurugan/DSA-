
package student;

import java.util.Scanner;


public class College {
    static final String collegeName;
    final int registrationFee;
    static int totalStudents;
    
    College(int registrationFee)
    {
        this.registrationFee = registrationFee;
        totalStudents++;
    }
    
    static
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("COLLEGE NAME: ");
        collegeName = sc.nextLine();
        //System.out.println(collegeName);
    }
    
    
    static void displayCollegeDetails()
    {
        System.out.println("CollegeName: "+collegeName);
        System.out.println("Total Students: "+totalStudents);
    }
    
    void displayStudentFee()
    {
        System.out.println("Registration Fee: "+registrationFee);
    }
    
}
