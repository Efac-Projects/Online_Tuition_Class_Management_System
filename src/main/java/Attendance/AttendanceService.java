package Attendance;

import Session.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendanceService {
    public AttendanceService() {
    }

    InMemortAttedanceDb inMemortAttedanceDb = new InMemortAttedanceDb();

    public void markAttendance() {
        System.out.println(" Mark attendance");
        Scanner in = new Scanner(System.in);

        System.out.println(" Enter date");
        String Date = in.nextLine();

        System.out.println(" Enter Time Range");
        String TimeRange = in.nextLine();

        Session session1 = new Session(Date, TimeRange);

        List<String> presentStudents = new ArrayList<>();

        System.out.println("Please enter all present studnet' names in the session, when you finish type 'close'");

        while (in.hasNext()) {
            String line = in.nextLine();

            if("close".equals(line)) {
                break;
            }

            presentStudents.add(line);
        }

        inMemortAttedanceDb.store(session1,presentStudents);
        System.out.println("Student.Student attandance is recorded");
    }
}
