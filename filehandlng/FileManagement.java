
package filehandlng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileManagement {
    
    Scanner sc = new Scanner(System.in);
    File f = new File("MyFolder");
    File file = new File("C:\\Users\\ArunRaj\\Documents\\NetBeansProjects\\JavaApplication6\\MyFolder\\student.txt");
    public static void main(String[] args) throws IOException {
        
        
        FileManagement f = new FileManagement();
        f.menu();
        
    }
    
    void menu() throws IOException{
        
        if(file.createNewFile()){
            System.out.println("File Created Successfully!");
        }
        else{
            System.out.println("File Already Created");
        }
        
        
            boolean exit = true;
        do{
            System.out.println("1.Write Data");
            System.out.println("2.Read Data");
            System.out.println("3.Append Data");
            System.out.println("4.Exit");
            
            System.out.print("Option: ");
            int option = sc.nextInt();
            
            sc.nextLine();
            switch(option){
                case 1:{
                    writeData();
                    break;
                }
                
                case 2:{
                    readData();
                    break;
                }
                case 3:{
                    appendData();
                    break;
                }
                default:{
                    System.out.println("Exiting....");
                    exit = false;
                }
            }
           
        }while(exit);
        
    }
    
    void writeData() throws IOException{
        FileWriter writer = new FileWriter(file);
        
        System.out.print("Enter data: ");
        writer.write(sc.nextLine()+" ");
        
        writer.close();
        
        System.out.println("Done");
    }
    
    void readData() throws FileNotFoundException{
        
        if(!file.exists()){
            System.out.println("File doesn't exist!");
            return;
        }
        
        FileReader reader = new FileReader(file);
        
        Scanner read = new Scanner(reader);
        
        while(read.hasNext()){
            String data = read.nextLine();
            System.out.println(data);
        }
        read.close();
    }
   
    void appendData() throws IOException{
        
        FileWriter writer = new FileWriter(file,true);
        
        System.out.print("Add new data: ");
        
        writer.write("\n"+sc.nextLine());
        
        writer.close();
        
        System.out.println("Data appended!");
    }
}
