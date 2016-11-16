/**
 * Created by oscarricaud on 11/16/16.
 */
public class Student {
    private int id;
    private String first_name;
    private String last_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void register(String userInput) {
        if(userInput.equalsIgnoreCase("No")){
            register(first_name, last_name, id);
        }
        else{
            System.out.println("\n Great! Since you are already register with our system, then you can skip" +
                    "the registration for new students. \n What would you like to do today? Register, Check Transcript or" +
                    "Drop a class?");
        }
    }
    public void register(String firstName, String lastName, int id) {
        
    }

    public void checkTranscript(){

    }
    public void drop_a_class(){

    }
}
