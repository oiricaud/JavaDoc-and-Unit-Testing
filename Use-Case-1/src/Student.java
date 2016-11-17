import java.util.LinkedList;
import java.util.Scanner;
/**
 * The Student Class has fields defined first name, last name and id variables to construct the methods.
 * @author Oscar I. Ricaud
 * @version 1.0 Build November 16, 2016
 */
class Student {
    private Scanner input =new Scanner(System.in);
    private String id;
    private String first_name;
    private String last_name;
    private LinkedList<String> classes;
    public boolean registered = false;

    Student() {
    }
    /**
     * @return a string to obtain the User's first name
     */
    public String getFirst_name() {
        return first_name;
    }
    /**
     * @param first_name sets String user's first name
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    /**
     * @return a String type to obtain the User's ID #
     */
    public String getId() {
        return id;
    }
    /**
     * @param id Sets the ID of the user to be able to do JUnit testing
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return a String type to obtain the last name of the user
     */
    private String getLast_name() {
        return last_name;
    }
    /**
     * @param last_name Sets the last name of the user to be able to do JUnit testing
     */
    private void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    /**
     * @return the list of classes the user is currently registered for
     */
    public String getClasses() {
        return classes.toString();
    }
    /**
     * @param classes Sets the classes for the user.
     */
    public void setClasses(LinkedList<String> classes) {
        this.classes = classes;
    }

    /**
     * Allows new users to register with our system if the user already has an account it will immediately ask the user
     * for 3 different things it can do, Select a class, or Drop a class.
     * @param userInput takes in as an argument the user's input based on their registration status.
     */
    void register(String userInput) {
        if(userInput.equalsIgnoreCase("No")){
           is_not_register(first_name, last_name, id);
        }
        else{
            System.out.println("\n Great! Since you are already register with our system, then you can skip" +
                    " the registration for new students. \n What would you like to do today? Select a class or " +
                    "Drop a class?");
            String whatToDo = "";
            is_register(getFirst_name(), getLast_name(), getId(), whatToDo);
        }
    }
    public boolean registered(String course) {
        if(getClasses().contains(course)) {
            return true;
        }
        return false;
    }
    /**
     * @param first_name is the first name of the registered user
     * @param last_name is the last name of the registered user
     * @param id        is the id of the registered user
     */
    private void is_register(String first_name, String last_name, String id, String whatToDo) {

        if(whatToDo.equalsIgnoreCase("Select a class")) {
            selectClass("Discrete Math");
        }

        if(whatToDo.equalsIgnoreCase("")){
            System.out.println("User, we must do something");
        }
    }

    /**
     * @param first_name sets the first name of the user
     * @param last_name sets the last name of the user
     * @param id sets the id of the user
     * @return student is now registered
     */
    public boolean is_not_register(String first_name, String last_name, String id) {
        setFirst_name(first_name);
        setLast_name(last_name);
        setId(id);
       // verifyInfo();
        return registered = true;
    }
    /**
     *  This method asks the user to verify their credentials if they are incorrect the user is taken back to the
     *  register method.
     */
    private void verifyInfo() {
        System.out.println("\n So you say your first name is: " + getFirst_name() + " your last name is: " + getLast_name()
                + " and your ID number is " + getId() + " is this correct?");
            register(input.next());
    }
    /**
     *  This method creates a placement of list which allows the user to type in the classes they are trying to register
     *  for. After, the list is passed down to a setter method, setClasses.
     * @param s allows the user to throw in the class it wants to register for the function of the @see selectClass.
     */
    public void selectClass(String s) {
        LinkedList<String> holdOnClasses = new LinkedList<String>();
        holdOnClasses.add(s);

        setClasses(holdOnClasses);
    }

    /**
     *  This method allows the user to drop classes, it will have a try and catch method to verify if the user has classes
     *  to drop.
     */
    public boolean drop_a_class(String course){
        if(!(getClasses().contains(course))){
            return true;
        }
        return false;
    }
}
