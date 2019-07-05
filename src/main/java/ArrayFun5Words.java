import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initializes array (size: 5)
        String array[]=new String[5];

        //User Input
        System.out.println("Please type in 5 words, pressing enter after each entry");


        //Array set up
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }

        System.out.println("Index        Value");

        //prints array
        for (int i = 0; i < array.length; i++) {
            System.out.println("  " + i + "          " + array[i] + " ");
        }
    }
}
