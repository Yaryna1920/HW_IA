package P2;

import P1.Employee;

public class EmployeeTestAlt {
    public static void main(String args[]) {
        Employee employee1 = new Employee("Petrenko");
        Employee employee2 = new Employee("Shevchenko");
        Employee employee3 = new Employee("Stepanenko");


        System.out.println("The following employees work in our department: " + employee1.showInfo() + ", " + employee2.showInfo() + ", " + employee3.showInfo() + ".");

    }
}
