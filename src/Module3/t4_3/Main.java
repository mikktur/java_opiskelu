package Module3.t4_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Main {
    public static void main(String[] args) {
        String filepath = "enrollment.ser";
        Student student = new Student(1, "Mikko", 30);
        Course course = new Course("Java", "JAV101", "Matti Meikäläinen");
        Enrollment enrollment = new Enrollment(student, course, "01.01.2023");
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(enrollment);
            out.close();
            fileOut.close();
        } catch (Exception e) {
            System.out.println("asdsaad");
        }
        try { ObjectInputStream in = new ObjectInputStream(new FileInputStream(filepath));
            Enrollment e = (Enrollment) in.readObject();
            in.close();
            System.out.println("Student: " + e.getStudent().getName());
            System.out.println("Course: " + e.getCourse().getCourseName());
            System.out.println("Enrollment Date: " + e.getEnrollmentDate());
        } catch (Exception e) {
            System.out.println("asda");

        }


    }
}
