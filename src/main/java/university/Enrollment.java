package university;

public class Enrollment {

    private Student student;
    private Course course;

    public Enrollment(Student student,Course course)
    {
        this.student = student;
        this.course = course;
    }

    // get enrolled student name and his course;

    public void getStudentName()
    {
        System.out.print(this.student.getStudentName());
    }

    public void getCourseName()
    {
        System.out.print(this.course.getCourseName());
    }
}
