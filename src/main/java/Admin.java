import Attendance.AttendanceService;
import Session.Session;
import Session.SessionService;
import Student.StudentService;
import Class.ClassService;
import ClassAssignment.ClassAssignmentService;

import java.util.*;

public class Admin {

    StudentService studentService = new StudentService();
    ClassService classService = new ClassService();
    ClassAssignmentService classAssignmentService = new ClassAssignmentService();
    SessionService sessionService = new SessionService();
    AttendanceService attendanceService = new AttendanceService();

    public Admin() {

    }

    public void CreateStudent() {
       studentService.CreateStudent();
    }

    public void CreateClass() {
       classService.CreateClass();
    }

    public void AssignClasses () {
        classAssignmentService.AssignClasses();
    }

    public void createSessions() {
        sessionService.createSession();
    }

    public void markAttendance() {
        attendanceService.markAttendance();
    }

}
