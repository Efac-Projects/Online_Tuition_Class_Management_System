package Attendance;

import Session.Session;

import java.util.List;
import java.util.Map;

public interface AttendanceDB {
    void store(Session session, List<String> names);
    Map<Session,List<String>> getAttandance();
}
