
/*
import Class.SClass;
import Class.ClassService;
import ClassAssignment.ClassAssignmentService;
import Student.Student;
import Session.Session;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;




public class InMemorySessionDBTest {

    @Test
    public void want_to_store_session_when_create(){

        ClassService classes = mock(ClassService.class);
        doNothing().when(classes).CreateClass("Math","Joy",10);
        SClass sclass = new Sclass("11","Math","John");
        //Session session = new Session("19-10-2021", "1pm - 2pm");
        Session session = new Session("19-10-2021","1pm-2pm");
        InMemorySessionDBTest store = new InMemorySessionDBTest(classes);

        store.storeSession(session);
        assertThat(store.getSessions(), hasSize(1));
    }
}
