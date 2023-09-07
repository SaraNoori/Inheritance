public abstract class Student implements Serializable
{
    // instance data
    private String firstName;
    private String lastName;
    private float gpa;
    private String idNum;

    // getters and setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String name) { firstName = name; }

    public String getLastName(){ return lastName; }
    public void setLastName(String name) { lastName = name; }

    public float getGPA() { return gpa; }
    public void setGPA(float newGPA) { gpa = newGPA; }

    public String getIDNum() { return idNum; }
    public void setIDNum(String newID) { idNum = newID; }


    // abstract methods
    public abstract String getDegree();


    // implementing Serializable methods
    public String getSerialData()
    {
        return firstName + "," + lastName + "," + gpa;
    }


    // --Constructor--
    public Student (String firstName, String lastName, float gpa, String idNum)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.idNum = idNum;
    }

    public String toString()
    {
        return "STUDENT " + getFirstName() + " " + getLastName() + ": " + getIDNum();
    }
}
