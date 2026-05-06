
package homework;


public class Employee {
    int empId;
    String empName;
    String dept;
    double basicSalary;

    public Employee(int empId, String empName, String dept, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        this.basicSalary = basicSalary;
    }
    
    double calculateNetSalary(){
        double hra = 0.20*basicSalary;
        double da = 0.10*basicSalary;
        double pf = 0.05*basicSalary;
        return basicSalary+hra+da-pf;
    }
    
    void display(){
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Department: "+dept);
        System.out.println("Basic Salary: "+basicSalary);
    }
}
