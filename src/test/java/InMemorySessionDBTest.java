
import Class.SClass;
import Class.ClassService;

import Session.Session;
import Session.InMemorySessionDB;
import org.hamcrest.collection.IsMapContaining;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;




public class InMemorySessionDBTest {

    @Test
    public void want_to_return_empty(){
        InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();
        assertThat(inMemorySessionDB.getSessions(),is(anEmptyMap()));

    }

    @Test
    void should_storeSessions_when_SessionisGiven() {

        ClassService classes = mock(ClassService.class);
        doNothing().when(classes).CreateClass();
        SClass sclass = new SClass(2020,"Maths","Kamal");
        Session session1 = new Session("19-10-2021", "1pm - 2pm");
        Session session2 = new Session("19-10-2021","1pm-2pm");

        List<Session> sessions = new ArrayList<>();

        sessions.add(session1);
        sessions.add(session2);

        InMemorySessionDB sessionDB = new InMemorySessionDB();
        sessionDB.storeSession("2021 - Maths - Grade 10",sessions);

        assertThat(sessionDB.getSessions(), IsMapContaining.hasEntry("2021 - Maths - Grade 10",sessions));
        assertThat(sessionDB.getSessions(), IsMapContaining.hasKey("2021 - Maths - Grade 10"));
        assertThat(sessionDB.getSessions(), IsMapContaining.hasValue(sessions));
    }
}
