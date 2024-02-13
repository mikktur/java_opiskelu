package Module3.t4_3;
import java.io.Serializable;
public class Course implements Serializable {
    String courseName;
    String courseCode;
    String instructor;
    public Course(String courseName, String courseCode, String instructor){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructor() {
        return this.instructor;
    }

}
