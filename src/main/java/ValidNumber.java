import java.util.Scanner;

public class ValidNumber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");

        int input = scanner.nextInt();

        while (input < 1 || input > 10) {
            System.out.println("You must enter a number between 1 and 10, please try again.");
            input = scanner.nextInt();

            if (input > 0 && input < 11) {
                break;
            }
        }

        System.out.println(+ input);



    }
}
