package Session;

import org.hamcrest.collection.IsMapContaining;
import org.junit.jupiter.api.Test;
import Session.InMemorySessionDB;

import java.io.Console;
import java.util.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import  static  org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

class InMemorySessionDBTest {

    @Test
    public void want_to_return_empty(){
        InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();
        assertThat(inMemorySessionDB.getSessions().size(),is(0));
    }

    @Test
    public void want_to_store_session_when_session_is_given(){
        InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();
        Session session1 = new Session("19-10-2021","1pm-2pm");
        Session session2 = new Session("20-10-2021","3pm-4pm");
        List<Session> Sessions = Arrays.asList(session1,session2);
        String sessionName="sessionName";
        inMemorySessionDB.storeSession(sessionName,Sessions);

        assertThat(inMemorySessionDB.getSessions().size(),is(1));

    }
    @Test
    public void want_to_contain_session_when_create(){
        Session session1 = new Session("19-10-2021","1pm-2pm");
        Session session2 = new Session("20-10-2021","3pm-4pm");
        List<Session> Sessions = Arrays.asList(session1,session2);
        String sessionName="sessionName";
        InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();
        inMemorySessionDB.storeSession(sessionName,Sessions);

        assertThat(inMemorySessionDB.getSessions(), IsMapContaining.hasEntry(sessionName,Sessions));
        assertThat(inMemorySessionDB.getSessions(), IsMapContaining.hasKey(sessionName));
        assertThat(inMemorySessionDB.getSessions(), IsMapContaining.hasValue(Sessions));

    }

    @Test
    public void want_to_store_all_session_for_multiple_creation(){
        Session session1 = new Session("19-10-2021","1pm-2pm");
        Session session2 = new Session("20-10-2021","3pm-4pm");
        Session session3 = new Session("19-10-2021","1pm-2pm");
        Session session4 = new Session("20-10-2021","3pm-4pm");

        InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();
        List<Session> Sessions1 = Arrays.asList(session1,session2);
        String sessionName1="sessionName1";

        List<Session> Sessions2 = Arrays.asList(session3,session4);
        String sessionName2="sessionName2";

        inMemorySessionDB.storeSession(sessionName1,Sessions1);
        inMemorySessionDB.storeSession(sessionName2,Sessions2);

        assertThat(inMemorySessionDB.getSessions(), IsMapContaining.hasEntry(sessionName1,Sessions1));
        assertThat(inMemorySessionDB.getSessions(), IsMapContaining.hasEntry(sessionName2,Sessions2));

        assertThat(inMemorySessionDB.getSessions(), IsMapContaining.hasKey(sessionName1));
        assertThat(inMemorySessionDB.getSessions(), IsMapContaining.hasValue(Sessions1));

        assertThat(inMemorySessionDB.getSessions(), IsMapContaining.hasKey(sessionName2));
        assertThat(inMemorySessionDB.getSessions(), IsMapContaining.hasValue(Sessions2));

    }
}
