import org.junit.Test;

import static org.junit.Assert.*;
/**
 *  The JUnit_Student_Test1 Class runs on a few tests:
 *  Student are you registered with our system?
 *  Student if you are not registered with our system are you able to register and return the correct credentials?
 *  Student are you able to drop a class successfully?
 *  Student are you able to select a class?
 * @author Oscar I. Ricaud
 * @version 1.0 Build November 16, 2016
 */
public class JUnit_Student_Test1 {
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
    /** Verifies if the student is registered, if it isn't
     * then it registers the students and tests if the student's input is correct
     */
    @Test
    public void is_not_register() {
        Student st = new Student();
        st.is_not_register("Oscar", "Ricaud", "80293822");
        assertSame("Oscar", st.getFirst_name()); // Test passes
        assertTrue(st.registered); // Test passes
    }
    /** Use Case 2: Select Class
     *  Allows the user to select a class to register for, then I have two tests. Test 1 to verifies if the user
     *  did indeed register for the correct class. Then Test 2 verfies if the user is registered for that class.
     */
    @Test
    public void selectClass()  {
        Student st = new Student();
        st.selectClass("Discrete Math");
        assertEquals(st.getClasses(), "[Discrete Math]");
        assertTrue(st.registered("Discrete Math"));
    }
    /** Use Case 3: Drop Class
     * Checks if the user is enrolled in the class it wants to drop.
     * Checks if the user did indeed drop the class
     */
    @Test
    public void drop_a_class() {
        Student st = new Student();
        st.selectClass("Discrete Math");
        assertEquals(st.getClasses(), "[Discrete Math]");
        //assertTrue();
    }

}