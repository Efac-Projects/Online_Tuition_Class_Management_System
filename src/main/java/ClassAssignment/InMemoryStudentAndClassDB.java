package ClassAssignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStudentAndClassDB implements StudentAndClassDB {

    Map<String, List<String>> studentClasses = new HashMap<>();

    @Override
    public void store(String name1, List<String> names) {
        studentClasses.put(name1,names);
    }

    @Override
    public Map<String, List<String>> getStudentAndClasses() {
        return studentClasses;
    }
}
