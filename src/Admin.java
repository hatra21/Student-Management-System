import java.util.Scanner;

public class Admin {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public void addStudentGrade(Student student) {
        Scanner input = new Scanner(System.in);
        System.out.println("Amount of points deducted for student " + student.getLastName() + " ID: " + student.getStudentID());
        float amount = input.nextFloat();
        float newGrade = student.getGrade() + amount;
        student.setGrade(newGrade);

    }

    public void deductStudentGrade(Student student) {
        Scanner input = new Scanner(System.in);
        System.out.println("Amount of points deducted for student " + student.getLastName() + " ID: " + student.getStudentID());
        float amount = input.nextFloat();
        float newGrade = student.getGrade() - amount;
        student.setGrade(newGrade);

    }

}
