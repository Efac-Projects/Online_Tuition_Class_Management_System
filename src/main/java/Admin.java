import java.util.*;

public class Admin {
    InMemoryStudentDB students = new InMemoryStudentDB();
    InMemoryClassDB classes = new InMemoryClassDB();
    Map<String, List<String>> studentClasses = new HashMap<>();

    public Admin() {
    }

    public void CreateStudent() {
        Student student = new Student();
        students.store(student);
        System.out.println("Student is created\n"+student.getId()+
                "\n" + student.getName()+
                "\n" + student.getDob()+
                "\n" + student.getJoinedDate());
    }


    public void CreateClass() {
        SClass sClass = new SClass();
        classes.store(sClass);
        System.out.println("Class is created\n"+sClass.getName()+
                "\n" + sClass.getTeacherName()+
                "\n" + sClass.getYear());
    }

    public void AssignClasses () {
        System.out.println("Assign classes for students");
        this.classes.getClasses().forEach((c) -> System.out.println(c.getName()));
        System.out.println(" All students ");
        this.students.getStudents().forEach((c) -> System.out.println(c.getId() + ":" + c.getName()));

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
        studentClasses.put(className,Students);

        System.out.println("Studenta are succesfully assigned to classes");

    }


}
