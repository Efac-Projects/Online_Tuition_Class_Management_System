package StudentStoreTest;

import Student.Student;
import Student. InMemoryStudentDB;
import org.junit.jupiter.api.Test;

import  static  org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

public class SDataBaseTest {

    @Test
    public void should_returnEmpty_when_storeIsCreated() {
       InMemoryStudentDB inMemoryStudentDB = new InMemoryStudentDB();
        assertThat(inMemoryStudentDB.getStudents(),is(empty()));
    }

    @Test
    public void should_storeStudent_when_StudentIsGiven() {
        InMemoryStudentDB inMemoryStudentDB = new InMemoryStudentDB();
        Student student = mock(Student.class);
        inMemoryStudentDB.store(student);
        assertThat(inMemoryStudentDB.getStudents(),hasSize(1));
    }


    @Test
    public void should_containStudent_when_StudentIsStore() {
        InMemoryStudentDB inMemoryStudentDB = new InMemoryStudentDB();
        Student student = new Student(1,"Saman","2005-10-22","2020-10-11");
        inMemoryStudentDB.store(student);
        assertThat(inMemoryStudentDB.getStudents(),contains(student));
    }

    @Test
    public void should_containAllStudent_when_moreStudentStored() {
        InMemoryStudentDB inMemoryStudentDB = new InMemoryStudentDB();
        Student student1 = new Student(1,"Saman","2005-10-22","2020-10-11");
        Student student2 = new Student(1,"Sirimal","2008-10-22","2020-05-11");
        inMemoryStudentDB.store(student1);
        inMemoryStudentDB.store(student2);
        assertThat(inMemoryStudentDB.getStudents(),containsInAnyOrder(student1,student2));
    }
}
