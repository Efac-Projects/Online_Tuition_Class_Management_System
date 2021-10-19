package Class;

import java.util.List;

public class ClassService {
    public ClassService() {
    }

    InMemoryClassDB classes = new InMemoryClassDB();

    public void CreateClass() {
        SClass sClass = new SClass();
        classes.store(sClass);
        System.out.println("Class is created\n"+sClass.getName()+
                "\n" + sClass.getTeacherName()+
                "\n" + sClass.getYear());
    }
   public List<SClass> getClasses() {
        return classes.getClasses();
   }
}
