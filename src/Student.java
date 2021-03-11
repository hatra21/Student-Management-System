import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses = "";
    private int tuition;
    private static int costPerCourse = 325;
    private static int id = 1000;
    private float grade = 100;

    public Student() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = input.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = input.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade year: ");
        this.year = input.nextInt();

        generateStudentID();
        //System.out.println(this.firstName + " " + this.lastName + " " + this.year + " " + this.studentID);
//        registerForClass();


    }

    private void generateStudentID() {
        //grade level + id
        id++;
        this.studentID = this.year + "" + id;
    }

    public void registerForClass() {
        do {
            System.out.print("Register a course (type '0' to finalize): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("0")) {
                courses += "\n   " + course;
                tuition += costPerCourse;
            } else {
                break;
            }
        } while (true);

        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION FEE: $" + tuition);


    }

    public void showTuition() {
        System.out.println("Current amount owe: $" + tuition);
    }

    public void payTuition() {
        int amount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your payment: ");
        amount = input.nextInt();
        tuition -= amount;
        System.out.println("You've made a payment of $" + amount);
        showTuition();
    }


    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName +
                "\nGrade level: " + year +
                "\nStudent ID: " + studentID +
                "\nRegistered courses: " + courses +
                "\nAmount owe: $" + tuition);

        System.out.println();
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void showGrade() {
        System.out.println(this.lastName + " " + this.getStudentID() + " grade: " + this.getGrade());
    }
}
