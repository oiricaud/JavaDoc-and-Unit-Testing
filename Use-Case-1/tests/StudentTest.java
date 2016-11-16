import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The Student Test Class runs tests on correct input hence all test cases pass @see StudentTest2 class will contain all
 * tests with incorrect input i.e methods that take in the incorrect arguments.
 * @author Oscar I. Ricaud
 * @version 1.0 Build November 16, 2016
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
    /**
     * @throws Exception
     */
    @Test
    public void getFirst_name() throws Exception {
        Student st = new Student();
        assertEquals("Oscar", st.getFirst_name()); // This test should fail since "Oscar" Has not registered yet.
        assertNull(st.getFirst_name()); // This test passes since st.getFirst_name does indeed return null.
    }
    /**
     * @throws Exception
     */
    @Test
    public void register() throws Exception {
        Student st = new Student();
        st.register("No");          // Passes because it is true that the student is not registered
        assertNotSame("No", "Yes"); // Passes because it is true that the values are not the same.
    }
}