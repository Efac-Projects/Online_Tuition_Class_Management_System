package Attendance;

import Session.Session;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemortAttedanceDb implements AttendanceDB{

    Map<Session,List<String>> attendance = new HashMap<>();
    @Override
    public void store(Session session, List<String> names) {
        attendance.put(session,names);
    }

    @Override
    public Map<Session, List<String>> getAttendance() {
        return attendance;
    }
}
