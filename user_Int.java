import java.util.Scanner;

public class user_Int {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int num = reader.nextInt();

        System.out.println("You Entered: " + num);

    }
}
