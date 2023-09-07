import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("bob", "bobby", 3.5f, "821");
        Student s2 = new Student("tim", "timmy", 2.1f, "234");

        GradStudent gs1 = new GradStudent("bobetha", "bob", 2.4f, "123","The office", "the hours");
        GradStudent gs2 = new GradStudent("timmetha", "tim", 1.3f, "456", "other office", "other hours");

        s1.setFirstName("b");
        System.out.println(s1.getFirstName());
        s2.setIDNum("2");
        System.out.println(s2.getIDNum());
        gs1.setGPA(3f);
        System.out.println(gs1.getGPA());
        gs2.setOffice("new office");
        System.out.println(gs2.getOffice());

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(s1); 
        list.add(s2);
        list.add(gs1);
        list.add(gs2);

        for (Student student : list)
        {
            System.out.println(student);
            System.out.println(student.getSerialData());
        }

    }
}
