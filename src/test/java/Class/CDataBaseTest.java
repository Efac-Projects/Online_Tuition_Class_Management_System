package Class;

import org.junit.jupiter.api.Test;

import static java.util.Optional.empty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.*;


class CDataBaseTest {
    @Test
    public void should_returnEmptyList_firstTime(){
        InMemoryClassDB inMemoryClassDB = new InMemoryClassDB();
        assertThat(inMemoryClassDB.getClasses().size(),is(0));
    }

    @Test
    public void should_storeClass_when_classIsGiven(){
        InMemoryClassDB inMemoryClassDB = new InMemoryClassDB();
        SClass sClass = mock(SClass.class);
        inMemoryClassDB.store(sClass);
        assertThat(inMemoryClassDB.getClasses(), hasSize(1));
    }

    @Test
    public void should_getClass_when_classIsAvailable(){
        InMemoryClassDB inMemoryClassDB = new InMemoryClassDB();
        SClass sClass = new SClass(1,"class1","Kethaki");
        inMemoryClassDB.store(sClass);
        assertThat(inMemoryClassDB.getClasses(), contains(sClass));
    }

    @Test
    public void should_getAllClasses_when_moreClassesStored(){
        InMemoryClassDB inMemoryClassDB = new InMemoryClassDB();
        SClass sClass1 = new SClass(1,"class1","Kethaki");
        SClass sClass2 = new SClass(2,"class2","Kethaki");

        inMemoryClassDB.store(sClass1);
        inMemoryClassDB.store(sClass2);
        assertThat(inMemoryClassDB.getClasses(), containsInAnyOrder(sClass1,sClass2));
    }

}