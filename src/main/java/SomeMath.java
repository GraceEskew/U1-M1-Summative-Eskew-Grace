public class SomeMath {

    //CALLING METHODS
    public static void main(String[] args) {
        System.out.println(total5(1, 2, 3, 4, 5));
        System.out.println((double)(average5(1, 3, 5, 7, 9)));
        System.out.println(largest5(42.0, 35.1, 2.3, 40.2, 15.6));
    }

    //SUM
    public static int total5(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }


    //AVG
    public static int average5(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5;
    }


    //LARGEST
    public static double largest5(double a, double b, double c, double d, double e) {
        if (a > b && a > c && a > d && a > e){
            return a;
        } else if (b > a && b > c && b > d && b > e) {
            return b;
        } else if (c > a && c > b && c > d && c > e) {
            return c;
        } else if (d > a && d > b && d > c && d > e) {
            return d;
        } else {
            return e;
        }
    }
}
