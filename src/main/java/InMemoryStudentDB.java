import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentDB implements SDataBase{
    List<Student> students = new ArrayList<>();
    String StudentName;

    @Override
    public void store(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                StudentName = student.getName();
            }
        }
        return StudentName;
    }
}
