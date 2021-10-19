import java.util.List;

public interface SDataBase {
    void store(Student student);

    List<Student> getStudents();

    String findStudent(int id);
}
