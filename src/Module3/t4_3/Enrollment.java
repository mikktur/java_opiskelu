package Module3.t4_3;
import java.io.Serializable;
public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;
    public Enrollment( Student student, Course course, String enrollmentDate) {
        this.student =  student;
        this.course =  course;
        this.enrollmentDate = enrollmentDate;

    }

    public void setEnrollmentDate(String date) {
        this.enrollmentDate = date;
    }

    public String getEnrollmentDate() {
        return this.enrollmentDate;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return this.course;
    }



}
