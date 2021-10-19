package Student;

import java.util.List;

public class StudentService {
    public StudentService() {
    }

    InMemoryStudentDB students = new InMemoryStudentDB();

    public void CreateStudent() {
        Student student = new Student();
        students.store(student);
        System.out.println("Student.Student is created\n"+student.getId()+
                "\n" + student.getName()+
                "\n" + student.getDob()+
                "\n" + student.getJoninedDate());
    }

    public List<Student> getStudents() {
        return students.getStudents();
    }
}
