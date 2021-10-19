package Attendance;

import Session.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class AttendanceService {

    InMemortAttedanceDb inMemortAttedanceDb = new InMemortAttedanceDb();
    final Logger logger = Logger.getLogger(String.valueOf(AttendanceService.class));

    public void markAttendance() {
        logger.info("Mark attendance");
        Scanner in = new Scanner(System.in);

        logger.info("Enter date");
        String Date = in.nextLine();

        logger.info("Enter Time Range");
        String TimeRange = in.nextLine();

        Session session1 = new Session(Date, TimeRange);

        List<String> presentStudents = new ArrayList<>();

        logger.info("Please enter all present studnet' names in the session, when you finish type 'close'");

        while (in.hasNext()) {
            String line = in.nextLine();

            if("close".equals(line)) {
                break;
            }

            presentStudents.add(line);
        }

        inMemortAttedanceDb.store(session1,presentStudents);
        logger.info("Student.Student attandance is recorded");
    }
}
