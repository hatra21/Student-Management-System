import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of students to enroll: ");
        int numberOfStudent = input.nextInt();
        Student[] students = new Student[numberOfStudent];

        for (int i=0; i < numberOfStudent; i++) {
            students[i] = new Student();
            
            students[i].registerForClass();
            students[i].payTuition();
            students[i].displayInfo();
        }

//        students[0].displayInfo();
//        students[1].displayInfo();

    }
}
