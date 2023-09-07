public class UnderGradStudent extends Student
{
    private String firstName;
    private String lastName;
    private float gpa;
    private String idNum;

    public UnderGradStudent(String firstName, String lastName, float gpa, String idNum)
    {
        super(firstName, lastName, gpa, idNum);
    }

    public String getDegree()
    {
        return "2 or 4 year degree";
    }

}
