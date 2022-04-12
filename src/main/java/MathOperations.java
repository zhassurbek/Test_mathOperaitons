import java.util.List;

public class MathOperations {

        public int add(int a, int b) { return a + b; }

        public int subtraction(int a, int b) {
            return a - b;
        }

        public int multiplication(int a, int b) {
            return a * b;
        }

        public int division(int a, int b) {
            return (a / b);
        }

        public int getFibonacciValue(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else  {
            return getFibonacciValue(n - 1) + getFibonacciValue(n - 2);
        }
    }

}
