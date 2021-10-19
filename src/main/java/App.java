import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {

        Admin test = new Admin();
        final Logger logger = Logger.getLogger(String.valueOf(App.class));
        String message = """
                For create students enter 'create'\nFor create classes enter 'class'
                For assign students enter 'assign'\nFor create session enter 'session'
                For mark attendance enter 'mark' \nFor close application enter 'close'""";
        // Welcome section
        logger.info(message);

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if("create".equals(line)) {
                test.CreateStudent();
            }

            else if("class".equals(line)) {
                test.CreateClass();
            }

            else if("assign".equals(line)) {
                test.AssignClasses();
            }

            else if("session".equals(line)) {
                test.createSessions();
            }

            else if("mark".equals(line)) {
                test.markAttendance();
            }
            else if("close".equals(line)) {
                break;
            }
        }



    }
}

