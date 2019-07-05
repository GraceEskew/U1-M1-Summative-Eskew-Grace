import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initializes array (size: 5)
        int array[]=new int[5];

        //User Input
        System.out.println("Please type in 5 numbers and press Enter");


        //Array set up
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Index      Value");


        //prints array - added aesthetics present because I found them during research and wanted to try it out
        for (int i = 0; i < array.length; i++) {
            System.out.println("  " + i + "          " + array[i] + " ");
        }
    }
}