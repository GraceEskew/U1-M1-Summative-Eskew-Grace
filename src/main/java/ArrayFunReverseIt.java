public class ArrayFunReverseIt {
    public static void main(String [] args) {

        // declared array 1
        int[] arr1 = new int[] {1, 2, 3, 4, 5};

        System.out.println("Index      Value");

        // print for array 1
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("  " + i + "          " + arr1[i]);
        }

        // declared array 2
        int[] arr2 = new int[] {1, 2, 3, 4, 5};

        System.out.println("Index      Value");

        // print for array 2

        for (int i = arr2.length -1; i >= 0; i--) {
            System.out.println("  " + i + "          " + arr2[i]);
        }
    }
}
