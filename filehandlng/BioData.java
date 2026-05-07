
package filehandlng;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioData{
   
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
         File file = new File("C:\\Users\\ArunRaj\\Documents\\NetBeansProjects\\JavaApplication6\\MyFolder\\Biodata.txt");
         
         if(file.createNewFile()){
             System.out.println("File is Created!");
         }
         else{
             System.out.println("File is already created");
         }
         
         System.out.println("==============BIO DATA===============");
         
         FileWriter writer = new FileWriter(file);
         
         writer.write("========================BIO DATA=========================");
          writer.write("\n");
         writer.write("Personal Details\n");
         
         System.out.print("Name: ");
         writer.write("Name: ");
         writer.write(sc.nextLine()+"\n");
         
         System.out.print("Age: ");
         writer.write("Age: ");
         writer.write(sc.nextLine()+"\n");
         
         System.out.print("Gender: ");
         writer.write("Gender: ");
         writer.write(sc.nextLine()+"\n");
         
         System.out.print("DOB: ");
         writer.write("DOB: ");
         writer.write(sc.nextLine()+"\n");
         
         System.out.print("Blood Group: ");
         writer.write("Blood Group: "+sc.nextLine()+"\n");
         
         System.out.println("\n");  
         writer.write("\n");
         writer.write("Education"+"\n");
         
         System.out.print("Qualification: ");
         writer.write("Qualification: "+sc.nextLine()+"\n");
         
         System.out.print("College: ");
         writer.write("College: "+sc.nextLine()+"\n");
         
         System.out.print("CGPA: ");
         writer.write("CGPA: "+sc.nextLine()+"\n");
         
        System.out.println("\n");
       
          writer.write("\n");
         System.out.print("Skills: ");
         writer.write("Skills"+"\n");
         writer.write(sc.nextLine());
         
         System.out.println("\n");
          writer.write("\n");
         System.out.print("Experience: ");
         writer.write("Experience: "+sc.nextLine()+"\n");
         
         System.out.println("\n");
          writer.write("\n");
         writer.write("Contact"+"\n");
         
         System.out.print("Phone no: ");
         writer.write("Phone: "+sc.nextLine()+"\n");
         
         System.out.print("Email: ");
         writer.write("Email: "+sc.nextLine()+"\n");
         
         System.out.print("Address: ");
         writer.write("Address: "+sc.nextLine()+"\n");
         
         System.out.println("\n");
         
         System.out.print("Father Name: ");
          writer.write("\n");
          writer.write("Family"+"\n");
         writer.write("Father Name: "+sc.nextLine()+"\n");
         
         System.out.print("Mother Name: ");
         writer.write("Mother Name: "+sc.nextLine()+"\n");
         
         writer.write("=========================================================");
         
         writer.close();
         
//         FileReader fr = new FileReader(file);
         
         Scanner se = new Scanner(file);    
              
         while(se.hasNextLine()){
             System.out.println(sc.nextLine());
         }
         se.close();
    }
    
}
