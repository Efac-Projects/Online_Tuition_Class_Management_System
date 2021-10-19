package ClassAssignment;

import java.util.List;
import java.util.Map;

public interface StudentAndClassDB {
    void store(String name1, List<String> names);
    Map<String,List<String>> getStudentAndClasses();
}
