package ClassAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Class.ClassService;
import Student.StudentService;

public class ClassAssignmentService {


    public ClassAssignmentService(  ) {

    }

    ClassService classService = new ClassService();
    StudentService studentService = new StudentService();
    InMemoryStudentAndClassDB inMemoryStudentAndClassDB = new InMemoryStudentAndClassDB();



    public void AssignClasses () {
        System.out.println("Assign classes for students");
        this.classService.getClasses().forEach((c) -> System.out.println(c.getName()));
        System.out.println(" All students ");
        this.studentService.getStudents().forEach((c) -> System.out.println(c.getId() + ":" + c.getName()));

        System.out.println("-------------------------------");

        System.out.println("Select a class");
        Scanner in = new Scanner(System.in);

        String className = in.nextLine();
        System.out.println("Assign student to this class. When you finish type 'close'");

        List<String> Students = new ArrayList<>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Students.add(line);

            if("close".equals(line)){
                break;
            }
        }
        inMemoryStudentAndClassDB.store(className,Students);

        System.out.println("Studenta are succesfully assigned to classes");

    }
}
