package Class;

import Attendance.AttendanceService;

import java.util.Scanner;
import java.util.logging.Logger;


public class SClass {
    private int Year;
    private String Name;
    private String TeacherName;

    final Logger logger = Logger.getLogger(String.valueOf(SClass.class));

    public SClass() {
        Scanner in = new Scanner(System.in);

        logger.info("Enter Class Year: ");
        this.Year = Integer.valueOf(in.nextLine());

        logger.info("Enter Class: ");
        this.Name = in.nextLine();

        logger.info("Enter Teacher Name: ");
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
