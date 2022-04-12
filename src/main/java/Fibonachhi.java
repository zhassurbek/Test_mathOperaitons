public class Fibonachhi {
//    public static void main(String[] args) {
//
//        System.out.println(getFibonacciValue(1));
//        System.out.println(getFibonacciValue(2));
//        System.out.println(getFibonacciValue(3));
//        System.out.println(getFibonacciValue(4));
//        System.out.println(getFibonacciValue(5));
////        int n0 = 1;
////        int n1 = 1;
////        int n2;
////        System.out.print(n0 + " " + n1 + " ");
////        for (int i = 3; i <= 11; i++) {
////            n2 = n0 + n1;
////            System.out.print(n2 + " ");
////            n0 = n1;
////            n1 = n2;
////        }
////        for (int i = 0; i < ; i++) {
//
//    }



    public static int getFibonacciValue(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else  {
            return getFibonacciValue(n - 1) + getFibonacciValue(n - 2);
        }
    }


}
