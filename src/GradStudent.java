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
    @Override public String getIDNum() { return "GR-" + super.getIDNum();}
    public void setIDnum(String newID) { super.setIDNum(newID); }

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

    @Override public String toString()
    {
        return "GRAD " + super.toString() + "; Office: " + office + ": " + officeHours; 
    }
}
