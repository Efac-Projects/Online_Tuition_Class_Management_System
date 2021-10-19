package Session;

import ClassAssignment.ClassAssignmentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class SessionService {

    InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();
    final Logger logger = Logger.getLogger(String.valueOf(SessionService.class));

    public void createSession() {
        logger.info("Enter your class Year");
        Scanner in = new Scanner(System.in);
        String classYear = in.nextLine();

        logger.info("Enter your class Name");
        String className = in.nextLine();

        logger.info("Enter your class Grade-X");
        String classGrade = in.nextLine();

        String fullName = classYear + "-" + className + "-" + classGrade;


        logger.info("Session.Session:'session', Close:'close' ");

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if("session".equals(line)) {
                List<Session> dateTimeList = new ArrayList<>();
                logger.info("Date:'2021-10-24', time:'15:30PM to 17:30PM' ");
                logger.info("Enter date");
                Scanner datetime = new Scanner(System.in);
                String date = datetime.nextLine();
                logger.info("Enter time");
                String time = datetime.nextLine();

                Session session1 = new Session(date, time);
                dateTimeList.add(session1);
                logger.info("If you want to add another session Enter 'session' otherwise 'close'");
                inMemorySessionDB.storeSession(fullName,dateTimeList);
            }
            if("close".equals(line)) {
                break;
            }
        }
}
}
