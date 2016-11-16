import java.util.Scanner;
/**
 * Created by Oscar I. Ricaud on 11/16/16.
 * Main.java V1
 */
public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Student st = new Student();
        System.out.println("Hey there, hi there, are you register with our System?");
        st.register(input.next());
    }
}
