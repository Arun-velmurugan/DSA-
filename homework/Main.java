
package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    List<Employee> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Main m1 = new Main();
       m1.menu(sc);
        
}  
    
    void menu(Scanner sc)
    {
        boolean exit = true;
        do{
            System.out.println("\n--- Employee Payroll Menu ---");
            System.out.println("1.Add Employee");
            System.out.println("2.View All Employees");
            System.out.println("3.Search Employee By ID");
            System.out.println("4.Update Basic Salary");
            System.out.println("5.Calculate Net Salary");
            System.out.println("6.Delete Employee");
            System.out.println("7.Exit");
            System.out.print("Option: ");
            int option = sc.nextInt();
            switch(option){
                case 1:{
                    addEmployee(sc);
                    break;
                }
                case 2:{
                    viewAllEmployees();
                    break;
                }
                case 3:{
                    searchEmployee(sc);
                    break;
                }
                case 4:{
                    updateBasicSalary(sc);
                    break;
                }
                case 5:{
                    calculateNetSalary(sc);
                    break;
                }
                case 6:{
                    deleteEmployee(sc);
                    break;
                }
                default:{
                    System.out.println("Exiting...");
                    exit = false;
                }
            }
            
        }while(exit);
    }
    void addEmployee(Scanner sc){
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
        for(Employee e:list){
            if(e.empId==id){
                System.out.println("Employee ID already Exists");
                return;
            }
        }
        
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        
        System.out.print("Enter BasicSalary: ");
        double salary = sc.nextDouble();
        
        list.add(new Employee(id,name,dept,salary));
        System.out.println("Employee Added Successfully");
    }
    
    void viewAllEmployees(){
        if(list.isEmpty()){
            System.out.println("No Employees found");
            return;
        }
        
        for(Employee e:list){
            e.display();
        }
    }
    
    void searchEmployee(Scanner sc){
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
        for(Employee e:list){
            if(e.empId==id){
                e.display();
                return;
            }
        }
        System.out.println("Employee not found!");
    }
    
    void updateBasicSalary(Scanner sc){
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
        for(Employee e:list){
            if(e.empId==id){
                System.out.print("Enter new Salary: ");
                e.basicSalary=sc.nextDouble();
                System.out.println("Salary Updated");
                return;
            }
        }
        System.out.println("Employee not found!");
    }
    
    void calculateNetSalary(Scanner sc){
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
        for(Employee e:list){
            if(e.empId==id){
                double net = e.calculateNetSalary();
                System.out.println("Net Salary: "+net);
                return;
            }
        }
    }
    
    void deleteEmployee(Scanner sc){
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        
       Iterator<Employee> it = list.iterator();
       
       while(it.hasNext()){
           Employee e = it.next();
           
           if(e.empId==id){
               it.remove();
               System.out.println("Employee Deleted Successfully!");
               return;
           }
       }
        System.out.println("Employee not found!");
    }
}
