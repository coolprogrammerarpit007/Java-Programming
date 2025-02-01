package university;

public class Course {

    private int courseId;
    private String courseName;

    public Course(int courseId,String courseName)
    {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public void getCourseId()
    {
        System.out.print(this.courseId);
    }

    public String getCourseName()
    {
        return this.courseName;
    }


}
