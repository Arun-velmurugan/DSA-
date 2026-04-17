
package stringmethods;

import java.util.Scanner;


public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        
        String words[] = sentence.trim().split("\\s+");
        String result ="";
        
        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb = new StringBuilder(words[i]);
            result = result + sb.reverse()+ " ";
        }
        System.out.println(result.trim());
    }
    
}
