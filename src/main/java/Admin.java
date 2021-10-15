import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin {
    InMemoryStudentDB students = new InMemoryStudentDB();
    InMemoryClassDB classes = new InMemoryClassDB();
    Map<String, List<String>> studentClasses = new HashMap<>();

    public Admin() {
    }

    public void CreateStudent() {
        Student student = new Student();
        students.store(student);
        System.out.println("Student is created\n"+student.getId()+
                "\n" + student.getName()+
                "\n" + student.getDob()+
                "\n" + student.getJoninedDate());
    }


    public void CreateClass() {
        SClass sClass = new SClass();
        classes.store(sClass);
        System.out.println("Class is created\n"+sClass.getName()+
                "\n" + sClass.getTeacherName()+
                "\n" + sClass.getYear());
    }


}
