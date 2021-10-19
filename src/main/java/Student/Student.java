package Student;

import java.util.Scanner;
import java.util.logging.Logger;

public class Student {
    private int Id;
    private String Name;
    private String Dob;
    private String JoninedDate;
    final Logger logger = Logger.getLogger(String.valueOf(Student.class));



    public Student() {

        Scanner in = new Scanner(System.in);

        logger.info("Enter student Id: ");
        this.Id = Integer.valueOf(in.nextLine());

        logger.info("Enter student first name: ");
        this.Name = in.nextLine();

        logger.info("Enter student date of birth: ");
        this.Dob = in.nextLine();

        logger.info("Enter student' joined date: ");
        this.JoninedDate = in.nextLine();


    }

    public Student(int id, String name, String dob, String joninedDate) {
        Id = id;
        Name = name;
        Dob = dob;
        JoninedDate = joninedDate;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getDob() {
        return Dob;
    }

    public String getJoinedDate() {
        return JoninedDate;
    }
}
