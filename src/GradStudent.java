public class GradStudent extends Student
{
    // instance data
    private String firstName;
    private String lastName;
    private float gpa;
    private String idNum;

    private String office;
    private String officeHours;   

    // getters and setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String name) { firstName = name; }

    public String getLastName(){ return lastName; }
    public void setLastName(String name) { lastName = name; }

    public float getGPA() { return gpa; }
    public void setGPA(float newGPA) { gpa = newGPA; }

    @Override public String getIDNum() { return "GR-" + super.getIDNum();}
    public void setIDnum(String newID) { idNum = newID; }


    public String getOffice() { return office; }
    public void setOffice(String newOffice) { office = newOffice; }

    public String getOfficeHours() { return officeHours; }
    public void setOfficeHours(String newHours) { officeHours = newHours; }

    // --Constructor--
    public GradStudent(String firstName, String lastName, float gpa, String idNum, String office, String officeHours)
    {
        super(firstName, lastName, gpa, idNum);
        this.office = office;
        this.officeHours = officeHours;
    }
}
