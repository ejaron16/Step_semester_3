package oop_classes_objects.assignment_problems;

public class Employee {
    String empId, empName;
    double sal;
    boolean isInt;

    public Employee(String empId, String empName, double sal) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.isInt = false;
    }
    public Employee(String empId, String empName) {
        this(empId, empName, 0.0);
        this.isInt = true;
    }
    public void printProfile(){
        System.out.println(empId+" | "+empName+" | Rs "+sal+" | Intern: "+isInt);
    }

    public static void main(String[] args){
        Employee p = new Employee("E-101","Diya",65000);
        p.printProfile();

        Employee i = new Employee("E-102", "Arjun");
        i.printProfile();
    }
}
