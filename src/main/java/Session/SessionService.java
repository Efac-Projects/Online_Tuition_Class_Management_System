package Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SessionService {
    public SessionService() {
    }
    InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();

    public void createSession() {
        System.out.println("Enter your class Year");
        Scanner in = new Scanner(System.in);
        String classYear = in.nextLine();

        System.out.println("Enter your class Name");
        String className = in.nextLine();

        System.out.println("Enter your class Grade-X");
        String classGrade = in.nextLine();

        String fullName = classYear + "-" + className + "-" + classGrade;


        System.out.println("Session.Session:'session', Close:'close' ");

        while (in.hasNextLine()) {
            String line = in.nextLine();
            if("session".equals(line)) {
                List<Session> dateTimeList = new ArrayList<>();
                System.out.println("Date:'2021-10-24', time:'15:30PM to 17:30PM' ");
                System.out.println("Enter date");
                Scanner datetime = new Scanner(System.in);
                String date = datetime.nextLine();
                System.out.println("Enter time");
                String time = datetime.nextLine();

                Session session1 = new Session(date, time);
                dateTimeList.add(session1);
                System.out.println("If you want to add another session Enter 'session' otherwise 'close'");
                inMemorySessionDB.storeSession(fullName,dateTimeList);
            }
            if("close".equals(line)) {
                break;
            }
        }
}
}
