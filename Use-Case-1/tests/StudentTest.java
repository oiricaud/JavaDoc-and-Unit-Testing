import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oscarricaud on 11/16/16.
 */
public class StudentTest {

    /** Both test pass because since the user is not registered the method is_not_register() handles that situation by
     * taking in arguments of the user's first and last name and their ID.
     * @throws Exception
     *
     */
    @Test
    public void is_not_register() throws Exception {
        Student st = new Student();
        st.is_not_register("Oscar", "Ricaud", "80293822");
        assertSame("Oscar", st.getFirst_name());
        assertTrue(st.registered); // Test passes because student is indeed registered.
    }

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
        assertNull(st.getFirst_name()); // This test passes since st.getFirst_name does indeed return null.
    }

    @Test
    public void register() throws Exception {
        Student st = new Student();
        st.register("No");
        assertNotSame("No", "Yes");
    }
}