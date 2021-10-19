package Class;

import java.util.ArrayList;
import java.util.List;

public class InMemoryClassDB implements CDataBase{
    List<SClass> classes = new ArrayList<>();

    @Override
    public void store(SClass sClass) {
        classes.add(sClass);
    }

    @Override
    public List<SClass> getClasses() {
        return classes;
    }
}
