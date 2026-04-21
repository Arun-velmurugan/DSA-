
package exceptionhandling3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        StudentMarks s1 = new StudentMarks();
        
        
        
        boolean exit = true;
        
        do{
            System.out.print("Option: ");
            int option=sc.nextInt();
            if(option==1)
            {
                StudentMarks.enterMarks(sc);
            }
            else if(option==2)
            {
                StudentMarks.displayMarks();
            }
            else{
                System.out.println("Exiting....");
                exit=false;
            }
        }while(exit);
    }
}
