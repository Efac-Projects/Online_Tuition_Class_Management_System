import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Student {
    private int Id;
    private String Name;
    private String Dob;
    private String JoinedDate;



    public Student() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter student Id: ");
        this.Id = Integer.valueOf(in.nextLine());

        System.out.print("Enter student first name: ");
        this.Name = in.nextLine();

        System.out.print("Enter student date of birth: ");
        this.Dob = in.nextLine();

        System.out.print("Enter student' joined date: ");
        this.JoinedDate = in.nextLine();

        setStudentId();
    }

    public Student(int id, String name, String dob, String joninedDate) {
        Id = id;
        Name = name;
        Dob = dob;
        JoinedDate = joninedDate;
    }

    public void setStudentId() {
        Random random = new Random();
        this.Id = random.nextInt() ;
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
        return JoinedDate;
    }
}
