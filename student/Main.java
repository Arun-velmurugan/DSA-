
package student;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount: ");
        int amount = sc.nextInt();
        College student1 = new College(amount);
         System.out.print("Amount: ");
        int amount2 = sc.nextInt();
        College student2 = new College(amount2);
        
        System.out.println("\n");
        College.displayCollegeDetails();
        student1.displayStudentFee();
        student2.displayStudentFee();
        
        
    }
}
