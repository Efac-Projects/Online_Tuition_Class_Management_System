package Session;

import java.util.List;

public interface SessionDataBase {
    void storeSession(String name, List<Session> sessions);
    List<Session> getSessions();
}
