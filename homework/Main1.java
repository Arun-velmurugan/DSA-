
package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Main1 {
    
    Scanner sc = new Scanner(System.in);
    Set<StudentClub> set = new HashSet<>();
    public static void main(String[] args) {
        Main1 m1 = new Main1();
        m1.menu();
    }
    
    void menu(){
        boolean exit = true;
        
        do{
            System.out.println("\n--- Student Club Management ---");
            System.out.println("1.Add Member");
            System.out.println("2.Remove Member");
            System.out.println("3.Search Member");
            System.out.println("4.Display All Members");
            System.out.println("5.Count Members");
            System.out.println("6.Exit");
            
            System.out.print("Option: ");
            int option = sc.nextInt();
            
            sc.nextLine();
            switch(option){
                case 1:{
                    addMember(sc);
                    break;
                }
                case 2:{
                    removeMember(sc);
                    break;
                }
                case 3:{
                    searchMember();
                    break;
                }
                case 4:{
                    displayAllMember();
                    break;
                }
                case 5:{
                    countMembers();
                    break;
                }
                default:{
                    System.out.println("Exiting...");
                    exit = false;
                }
            }
        }while(exit);
    }
    
    void addMember(Scanner sc){
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        if(set.add(new StudentClub(name))){
            System.out.println("Student Added Successfully!");
        }
        else{
            System.out.println("Student Already Exist");
        }
       
    }
    
    void removeMember(Scanner sc){
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        Iterator<StudentClub> it = set.iterator();
        
        while(it.hasNext()){
            StudentClub s = it.next();
            if(s.name.equals(name)){
                it.remove();
                System.out.println("Student Removed Successfully!");
                return;
            }
        }
            
        
        System.out.println("Student not found!");
    }
    
    void searchMember(){
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        for(StudentClub s:set){
            if(s.name.contains(name)){
                s.display();
                return;
            }
        }
        System.out.println("Student not found!");
    }
    
    void displayAllMember(){
        
        if(set.isEmpty()){
            System.out.println("Student not found!");
            return;
        }
        
        for(StudentClub s: set){
            s.display();
        }
        
    }
    
    void countMembers(){
        System.out.println("Total Club Members: "+set.size());
    }
}
