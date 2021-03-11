import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of students to enroll: ");
        int numberOfStudent = input.nextInt();
        Student[] students = new Student[numberOfStudent];
        Admin teacher = new Admin("Mark");

        for (int i=0; i < numberOfStudent; i++) {
            students[i] = new Student();
            
            students[i].registerForClass();
            students[i].payTuition();
            students[i].displayInfo();
            students[i].showGrade();
        }

//        students[0].displayInfo();
//        students[1].displayInfo();

        teacher.deductStudentGrade(students[0]);
        students[0].showGrade();


    }
}
