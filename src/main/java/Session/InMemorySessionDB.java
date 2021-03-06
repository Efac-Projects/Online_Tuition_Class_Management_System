package Session;

import java.util.*;

public class InMemorySessionDB implements SessionDataBase{

    Map<String, List<Session>> sessionsDB = new HashMap<>();

    @Override
    public void storeSession(String name, List<Session> session) {
        sessionsDB.put(name, session);
    }

    @Override
    public Map<String ,List<Session>>  getSessions() {
        return sessionsDB;
    }
}
