public class StudentTest {

    public static void main(String args[]) {
        Student student1 = new Student(1, "Iryna", "Panchenko", 1, 85, 90, 80);
        Student student2 = new Student(2, "Oksana", "Maryuk", 2, 75, 85, 90);
        Student student3 = new Student(3, "Oleh", "Petrenko", 3, 90, 80, 85);

        System.out.println("Average grade for " + student1.firstName + " " + student1.lastName + ": " + student1.calculateAverageGrade());
        System.out.println("Average grade for " + student2.firstName + " " + student2.lastName + ": " + student2.calculateAverageGrade());
        System.out.println("Average grade for " + student3.firstName + " " + student3.lastName + ": " + student3.calculateAverageGrade());
    }
}