package SessionTest;

import Session.InMemorySessionDB;
import Session.Session;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import  static  org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;


public class SessionDataBaseTest {
    @Test
    void should_Store_when_TimeandSessionsAreGiven() {
        InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();
        Session session1 = new Session("2021-10-04","13.30 to 15.30");
        Session session2 = new Session("2021-10-05","13.30 to 15.30");
        List<Session> sessions = new ArrayList<>();
        sessions.add(session1);
        sessions.add(session2);

        inMemorySessionDB.storeSession("Maths",sessions);
       // assertThat(inMemorySessionDB.getSessions(),containsInAnyOrder("Maths",sessions));

    }
}

