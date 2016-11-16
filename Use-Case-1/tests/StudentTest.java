import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oscarricaud on 11/16/16.
 */
public class StudentTest {
    @Test
    public void setFirst_name() throws Exception {

    }

    @Test
    public void getId() throws Exception {

    }

    @Test
    public void setId() throws Exception {

    }

    @Test
    public void getFirst_name() throws Exception {
        Student st = new Student();
        assertEquals("Oscar", st.getFirst_name()); // This test should fail since "Oscar" Has not registered yet.
    }

    @Test
    public void register() throws Exception {

    }

}