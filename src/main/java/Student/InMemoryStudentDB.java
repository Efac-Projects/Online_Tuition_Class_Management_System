package Student;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentDB implements SDataBase{
    List<Student> students = new ArrayList<>();

    @Override
    public void store(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }
}
