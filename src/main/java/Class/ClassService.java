package Class;

import Attendance.AttendanceService;

import java.util.List;
import java.util.logging.Logger;

public class ClassService {

    InMemoryClassDB classes = new InMemoryClassDB();
    final Logger logger = Logger.getLogger(String.valueOf(ClassService.class));

    public void CreateClass() {
        SClass sClass = new SClass();
        classes.store(sClass);
        logger.info("Class is created\n"+sClass.getName()+
                "\n" + sClass.getTeacherName()+
                "\n" + sClass.getYear());
    }
   public List<SClass> getClasses() {
        return classes.getClasses();
   }
}
