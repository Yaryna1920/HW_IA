package P1;

public class Employee {

    int id;
    public String surname;
    private double salary;

    public void displayId() {
        System.out.println("Employee ID: " + id);
    }

    public void displaySurname() {
        System.out.println("Employee Surname: " + surname);
    }

    public void displaySalary() {
        System.out.println("Employee Salary: " + salary);
    }

    public String showInfo() {
        return surname;
    }

    Employee(int id) {
        this.id = id;
    }

    public Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }
}
