import java.util.ArrayList;
import java.util.Scanner;

public class climarkbook {
    public static void main(String[] arg) {
        ArrayList students = new ArrayList();
        ArrayList marks = new ArrayList();
        Scanner in = new Scanner(System.in);
        System.out.print("Number of students: ");
        int numberOfStudents = in.nextInt();
        for(int i=1; i<=numberOfStudents; i++){
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Name of a student: ");
            String studentName = keyboard.next();
            students.add(studentName);
            Scanner mark = new Scanner(System.in);
            System.out.print("Mark for " + studentName + " : ");
            float studentMark = mark.nextFloat();
            marks.add(studentMark);
            System.out.println("Inputted: " + studentName + " = " + studentMark);

            // System.out.println("Count is: " + i);
        }

        System.out.println("x = " + numberOfStudents);
    }
}
