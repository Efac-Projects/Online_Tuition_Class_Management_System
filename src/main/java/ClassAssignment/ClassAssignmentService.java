package ClassAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import Class.ClassService;
import Student.StudentService;

public class ClassAssignmentService {




    ClassService classService = new ClassService();
    StudentService studentService = new StudentService();
    InMemoryStudentAndClassDB inMemoryStudentAndClassDB = new InMemoryStudentAndClassDB();
    final Logger logger = Logger.getLogger(String.valueOf(ClassAssignmentService.class));


    public void AssignClasses () {
        logger.info("Assign classes for students");
        this.classService.getClasses().forEach((c) -> logger.info(c.getName()));
        logger.info(" All students ");
        this.studentService.getStudents().forEach((c) -> logger.info(c.getId() + ":" + c.getName()));



        logger.info("Select a class");
        Scanner in = new Scanner(System.in);

        String className = in.nextLine();
        logger.info("Assign student to this class. When you finish type 'close'");

        List<String> Students = new ArrayList<>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Students.add(line);

            if("close".equals(line)){
                break;
            }
        }
        inMemoryStudentAndClassDB.store(className,Students);

        logger.info("Studenta are succesfully assigned to classes");

    }
}
