public class Student {
    int studentId;
    String firstName;
    String lastName;
    int course;
    double mathGrade;
    double economicsGrade;
    double foreignLanguageGrade;
    public Student(int studentId, String firstName, String lastName, int course, double mathGrade, double economicsGrade, double foreignLanguageGrade) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.foreignLanguageGrade = foreignLanguageGrade;
    }

    public double calculateAverageGrade() {
        return (mathGrade + economicsGrade + foreignLanguageGrade) / 3;
    }
}
