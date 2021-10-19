package Attendance;

import org.junit.jupiter.api.Test;

import Session.Session;
import org.hamcrest.Matchers;
import org.hamcrest.collection.IsMapContaining;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.mock;

class AttendanceDBTest {
    @Test
    public void should_returnEmpty_when_storeIsCreated() {
        InMemortAttedanceDb inMemortAttedanceDb = new InMemortAttedanceDb();
        assertThat(inMemortAttedanceDb.getAttandance(), Matchers.anEmptyMap());
    }

    @Test
    public void should_storeAttendance_when_SessionAndNameListGiven() {
        InMemortAttedanceDb inMemortAttedanceDb = new InMemortAttedanceDb();
        Session session = mock(Session.class);
        List<String> names = Arrays.asList("Anuradha", "Kethaki", "Thilina");
        inMemortAttedanceDb.store(session,names);

        assertThat(inMemortAttedanceDb.getAttandance().size(), is(1) );
    }


    @Test
    public void should_containSessionAndNames_when_sessionAndNamesStored() {
        InMemortAttedanceDb inMemortAttedanceDb = new InMemortAttedanceDb();
        Session session = new Session("2021.10.19","30min");
        List<String> names = Arrays.asList("Anuradha", "Kethaki", "Thilina");
        inMemortAttedanceDb.store(session,names);

        assertThat(inMemortAttedanceDb.getAttandance(), IsMapContaining.hasEntry(session,names));
        assertThat(inMemortAttedanceDb.getAttandance(), IsMapContaining.hasKey(session));
        assertThat(inMemortAttedanceDb.getAttandance(), IsMapContaining.hasValue(names));
    }

    @Test
    public void should_containAllSessionsAndNames_when_moreAttendanceStored() {
        InMemortAttedanceDb inMemortAttedanceDb = new InMemortAttedanceDb();
        Session session1 = new Session("2021.10.19","30min");
        Session session2 = new Session("2021.10.18","30min");

        List<String> names1 = Arrays.asList("Anuradha", "Kethaki", "Thilina");
        List<String> names2 = Arrays.asList("Affin", "Ramith");
        inMemortAttedanceDb.store(session1,names1);
        inMemortAttedanceDb.store(session2,names2);

        assertThat(inMemortAttedanceDb.getAttandance(), IsMapContaining.hasEntry(session1,names1));
        assertThat(inMemortAttedanceDb.getAttandance(), IsMapContaining.hasEntry(session2,names2));

        assertThat(inMemortAttedanceDb.getAttandance(), IsMapContaining.hasKey(session1));
        assertThat(inMemortAttedanceDb.getAttandance(), IsMapContaining.hasValue(names1));

        assertThat(inMemortAttedanceDb.getAttandance(), IsMapContaining.hasKey(session2));
        assertThat(inMemortAttedanceDb.getAttandance(), IsMapContaining.hasValue(names2));
    }
}
