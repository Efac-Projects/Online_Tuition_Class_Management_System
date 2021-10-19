package Session;

import java.util.List;
import java.util.Map;

public interface SessionDataBase {
    void storeSession(String name, List<Session> sessions);
    Map<String ,List<Session>> getSessions();
}
