package university;

public class Student {

    private int studentId;
    private String studentName;

    public Student(int studentId,String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // get student Id and name
    public String getStudentName()
    {
        return this.studentName;
    }

    public int getStudentId()
    {
        return this.studentId;
    }
}
