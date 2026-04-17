
package stringmethods;

import java.util.Scanner;


public class StringConcepts2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        String reverse ="";
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse = reverse+name.charAt(i);
            //System.out.print(reverse);
            
        }
        //String name1 = Character.toString(ch);
        if(name.equals(reverse))
        {
            System.out.println(name+" is a pallindrome");
        }
        else
        {
            System.out.println(name+"Not a pallindrome");
        }
    }
    
}
