import java.util.Scanner;

/**
 * Created by oscarricaud on 11/16/16.
 */
public class Student {
    Scanner input =new Scanner(System.in);
    private String id;
    private String first_name;
    private String last_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void register(String userInput) {

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
                    " the registration for new students. \n What would you like to do today? Register, Check Transcript or" +
                    "Drop a class?");
            input.next();
        }
    }
    public void verifyInfo() {
        System.out.println("\n So you say your first name is: " + getFirst_name() + " your last name is: " + getLast_name()
                + " and your ID number is " + getId() + " is this correct?");
            register(input.next());
    }

    public void checkTranscript(){

    }
    public void drop_a_class(){

    }
}
