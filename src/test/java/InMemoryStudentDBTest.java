import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import  static  org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

class InMemoryStudentDBTest {

    @Test
    public void should_returnEmptyList_firstTime(){
        InMemoryStudentDB inMemoryStudentDB = new InMemoryStudentDB();
        assertThat(inMemoryStudentDB.getStudents(), is(empty()));
    }

    @Test
    public void should_storeStudent_when_studentIsGiven(){
        InMemoryStudentDB inMemoryStudentDB = new InMemoryStudentDB();
        Student student = mock(Student.class);
        inMemoryStudentDB.store(student);
        assertThat(inMemoryStudentDB.getStudents(), hasSize(1));
    }

    @Test
    public void should_getStudent_when_studentIsAvailable(){
        InMemoryStudentDB inMemoryStudentDB = new InMemoryStudentDB();
        Student student = new Student(1,"Anuradha","1995-09-06", "2021-10-19");
        inMemoryStudentDB.store(student);
        assertThat(inMemoryStudentDB.getStudents(), contains(student));
    }

    @Test
    public void should_getAllStudents_when_moreStudentsStored(){
        InMemoryStudentDB inMemoryStudentDB = new InMemoryStudentDB();
        Student student1 = new Student(1,"Anuradha","1995-09-06", "2021-10-19");
        Student student2 = new Student(2,"Kethaki","1995-12-09", "2021-10-18");

        inMemoryStudentDB.store(student1);
        inMemoryStudentDB.store(student2);
        assertThat(inMemoryStudentDB.getStudents(), containsInAnyOrder(student1,student2));

    }
    @Test
    public void should_findStudent_when_studentIdGiven(){
        InMemoryStudentDB inMemoryStudentDB = new InMemoryStudentDB();
        Student student1 = new Student(1,"Anuradha","1995-09-06", "2021-10-19");

        inMemoryStudentDB.store(student1);

        assertThat(inMemoryStudentDB.findStudent(1), equalTo(student1.getName()));
    }
    
}
