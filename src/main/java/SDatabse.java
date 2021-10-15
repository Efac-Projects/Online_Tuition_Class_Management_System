import java.lang.reflect.Type;
import java.util.List;

public interface SDataBase {
    void store(Student student);

    List<Student> getStudents();
}
