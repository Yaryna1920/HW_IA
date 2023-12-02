package P1;

public class EmployeeTest {
    public static void main(String args[]) {
        Employee employee1 = new Employee(1);
        Employee employee2 = new Employee(2);
        Employee employee3 = new Employee(3);

        employee1.displayId();
        employee2.displaySalary();
        employee3.displaySurname();
    }
}
