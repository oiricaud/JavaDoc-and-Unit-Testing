import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Student st = new Student();
        System.out.println("Hello there are you register with our System?");
        st.register(input.next());
    }
}
