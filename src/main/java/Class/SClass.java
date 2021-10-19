package Class;

import java.util.Scanner;


public class SClass {
    private int Year;
    private String Name;
    private String TeacherName;

    public SClass() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Class Year: ");
        this.Year = Integer.valueOf(in.nextLine());

        System.out.print("Enter Class: ");
        this.Name = in.nextLine();

        System.out.print("Enter Teacher Name: ");
        this.TeacherName = in.nextLine();
    }

    public SClass(int year, String name, String teacherName) {
        Year = year;
        Name = name;
        TeacherName = teacherName;
    }

    public int getYear() {
        return Year;
    }

    public String getName() {
        return Name;
    }

    public String getTeacherName() {
        return TeacherName;
    }
}
