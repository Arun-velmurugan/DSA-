
package javaapplication6;


public class Student {
    int rollNo;
    String name;
    int age;
    String course;
    double marks;

    public Student(int rollNo, String name, int age, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }
    
    void display()
    {
        System.out.println("Roll No: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
        System.out.println("Marks: "+marks);
    }
    
}
