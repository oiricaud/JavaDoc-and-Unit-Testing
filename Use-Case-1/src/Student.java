import java.util.LinkedList;
import java.util.Scanner;
/**
 * The Student Class has defined first name, last name and id variables to construct the methods.
 * @author Oscar I. Ricaud
 * @version 1.0 Build November 16, 2016
 */
class Student {
    private Scanner input =new Scanner(System.in);
    private String id;
    private String first_name;
    private String last_name;
    private LinkedList<String> classes;

    /**
     * @return a string to obtain the User's first name
     */
    private String getFirst_name() {
        return first_name;
    }
    /**
     * @param first_name sets String user's first name
     */
    private void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return a String type to obtain the User's ID #
     */
    private String getId() {
        return id;
    }

    /**
     * @param id Sets the ID of the user to be able to do JUnit testing
     */
    private void setId(String id) {
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
     * @param userInput takes in as an argument the user's input based on their registration status.
     */
    void register(String userInput) {

        // Register for new students
        if(userInput.equalsIgnoreCase("No")){
            System.out.println("\n Okay, since you are not register then you can start up the registration process" +
                    " please give me your first name.");
            setFirst_name(input.next());
            System.out.println("Your last name");
            setLast_name(input.next());
            System.out.println("Your ID number");
            setId(input.next());
            verifyInfo();
        }
        else{
            System.out.println("\n Great! Since you are already register with our system, then you can skip" +
                    " the registration for new students. \n What would you like to do today? Select a class, Check Transcript or " +
                    "Drop a class?");
            String whatToDo = input.nextLine();
            if(whatToDo.equalsIgnoreCase("Select a class")){
                selectClass();
            }
            if(whatToDo.equalsIgnoreCase("Check Transcript")){
                checkTranscript();
            }
            if(whatToDo.equalsIgnoreCase("Drop a class")){
                drop_a_class();
            }
        }
    }

    private void verifyInfo() {
        System.out.println("\n So you say your first name is: " + getFirst_name() + " your last name is: " + getLast_name()
                + " and your ID number is " + getId() + " is this correct?");
            register(input.next());
    }

    private void selectClass() {
        System.out.println("\n Please tell me how many class you want to register for");
        LinkedList<String> holdOnClasses = new LinkedList<String>();
        int numOfClasses = input.nextInt();
        for(int i = 1; i < numOfClasses + 1; i++){
            System.out.println("For class "  + i + " please tell me the name of the course");
            holdOnClasses.add(input.next());
        }
        setClasses(holdOnClasses);
    }

    public void checkTranscript(){
        if(getClasses().isEmpty()){
            System.out.println("It appears that your transcript is empty, please try to register for classes " +
                    " before you attempt to view your transcript");
        }
        else{
            getClasses();
        }
    }
    private void drop_a_class(){
        System.out.println("\n What class would you like to drop?");
    }

    private LinkedList getClasses() {
        return classes;
    }
    private void setClasses(LinkedList<String> classes) {
        this.classes = classes;
    }
}
