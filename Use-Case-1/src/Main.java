import java.util.Scanner;
/**
 * The Main Class @see Student Class to allow the User to register for an account
 * @author Oscar I. Ricaud
 * @version 1.0 Build November 16, 2016
 */
public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Student st = new Student();
        System.out.println("Hey there, hi there, are you register with our System?");
        st.register(input.next());
    }
}
