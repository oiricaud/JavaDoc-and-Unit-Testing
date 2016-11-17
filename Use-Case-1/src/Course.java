import java.util.LinkedList;
/**
 * The Course Class has a list of courses called course_name
 * @author Oscar I. Ricaud
 * @version 1.0 Build November 16, 2016
 */
public class Course {
    private LinkedList<String> course_name;

    public LinkedList<String> getCourse_name() {
        return course_name;
    }

    public void setCourse_name(LinkedList<String> course_name) {
        this.course_name = course_name;
    }
}
