import java.util.Scanner;

public class swapNum {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter first Number: ");

        int swapnum1 = num1.nextInt();
        System.out.println("First Number: " + swapnum1);

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter second Number: ");

        int swapnum2 = num2.nextInt();
        System.out.println("Second Number: " + swapnum2);

        int swapnum3 = swapnum1;
        swapnum1 = swapnum2;
        swapnum2 = swapnum3;

        System.out.println("Swapped........");
        System.out.println("First Number: " + swapnum1);
        System.out.println("Second Number: " + swapnum2);


    }
}
