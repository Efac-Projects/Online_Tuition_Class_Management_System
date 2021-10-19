import Session.InMemorySessionDB;
import Session.Session;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;




public class InMemorySessionDBTest {

    @Test
    public void want_to_return_empty(){
        InMemorySessionDBTestDB inMemoryStudentDB = new InMemorySessionDBTest();
        assertThat(inMemorySessionDB.getSession(),is(empty()));

    }

    @Test
    public void want_to_store_session_when_session_is_given(){
      Session session = mock(Session.class);
      InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();
      inMemorySessionDB.storeSession(session);
      assertThat(inMemoryStudentDB.getSession(),hasSize(1));

    }
    @Test
    public void want_to_contain_session_when_create(){
        Session session = new Session("19-10-2021","1pm-2pm");
        InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();
        inMemorySessionDB.storeSession(session);
        assertThat(inMemoryStudentDB.getSession(),contains(session));

    }

    @Test
    public void want_to_store_all_session_for_multiple_creation(){
        Session session1 = new Session("19-10-2021","1pm-2pm");
        Session session2 = new Session("20-10-2021","3pm-4pm");
        InMemorySessionDB inMemorySessionDB = new InMemorySessionDB();
        inMemorySessionDB.storeSession(session1);
        inMemorySessionDB.storeSession(session2);
        assertThat(inMemoryStudentDB.getSession(),containsInAnyOrder(session1,session2));

    }


}
