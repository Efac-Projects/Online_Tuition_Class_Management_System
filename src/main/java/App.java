import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Admin test = new Admin();

        // Welcome section
        System.out.println("For create students enter 'create'\n For create classes enter 'class'");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if ("create".equals(line)) {
                test.CreateStudent();
            } else if ("class".equals(line)) {
                test.CreateClass();
            }
            else if("assign".equals(line)) {
                test.AssignClasses();
            }

            else if("session".equals(line)) {
                //test.createSessions();
            }

            else if("mark".equals(line)) {
                //test.markAttendance();
            }
            else if("close".equals(line)) {
                break;
            }
        }
    }

}

