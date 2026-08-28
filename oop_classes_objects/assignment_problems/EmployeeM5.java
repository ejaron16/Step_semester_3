package oop_classes_objects.assignment_problems;

public class EmployeeM5 {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeM5(String name, double sal) {
        empName = name;
        salary = sal;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        EmployeeM5 e1 = new EmployeeM5("Alice", 50000);
        EmployeeM5 e2 = new EmployeeM5("Bob", 55000);
        EmployeeM5 e3 = new EmployeeM5("Charlie", 60000);

        EmployeeM5.printCompanyInfo();
    }
}
