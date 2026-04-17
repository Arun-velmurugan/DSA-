
package stringmethods;

import java.util.Scanner;


public class StringConcepts {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = new String(sc.nextLine());
        int length = sentence.length();
        int chars = 0;
        int vowelsCount=0;
        //System.out.println(length);
        
        //No.of chars without spaces
        for(int i=0;i<length;i++)
        {
            if(sentence.charAt(i)==(sentence.charAt(i))&&(sentence.charAt(i)!=' '))
            {
                chars++;
            }
        }
        System.out.println(chars);
       
        String words[] = sentence.trim().split("\\s+");
        System.out.println(words.length);
        
        for(int i=0;i<length;i++)
        {
            char ch = (sentence.charAt(i));
            
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowelsCount++;
            }
        }
        System.out.println(vowelsCount);
        
    }
       
}
