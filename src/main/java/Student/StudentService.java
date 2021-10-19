package Student;

import java.util.List;
import java.util.logging.Logger;

public class StudentService {

    InMemoryStudentDB students = new InMemoryStudentDB();
    final Logger logger = Logger.getLogger(String.valueOf(StudentService.class));

    public void CreateStudent() {
        Student student = new Student();
        students.store(student);
        logger.info("Student.Student is created\n"+student.getId()+
                "\n" + student.getName()+
                "\n" + student.getDob()+
                "\n" + student.getJoinedDate());
    }

    public List<Student> getStudents() {
        return students.getStudents();
    }
}
