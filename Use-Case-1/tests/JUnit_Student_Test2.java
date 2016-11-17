import org.junit.Test;

import static org.junit.Assert.*;
/**
 *  The JUnit_Student_Test1 Class runs on a few tests:
 *  Student are you register with our system?
 *  Student if you are not registered with our system are you able to register and return the correct credentials?
 *  Student are you able to drop a class successfully?
 *  Student are you able to select a class?
 * @author Oscar I. Ricaud
 * @version 1.0 Build November 16, 2016
 */
public class JUnit_Student_Test2 {
    /** Use Case 1: Register
     *  Since we have not registered a student, the two tests to verify if the student
     *  is registered and verify they are not
     *  on the system pass the tests.
     */
    @Test
    public void register() {
        Student student = new Student();
        assertFalse(student.registered); // Test passes
        assertNull(student.getFirst_name()); // Test passes
    }

    /** Since the student is not registered with our system we register the student.
     * Now the 2 tests pass.
     */
    @Test
    public void is_not_register() {
        Student st = new Student();
        st.is_not_register("Oscar", "Ricaud", "80293822");
        assertSame("Oscar", st.getFirst_name()); // Test passes
        assertTrue(st.registered); // Test passes
    }

    /** Use Case 2: Drop Class
     * @throws Exception
     */
    @Test
    public void drop_a_class() throws Exception {

    }
    /** Use Case 3: Select Class
     * @throws Exception
     */
    @Test
    public void selectClass() throws Exception {

    }
}