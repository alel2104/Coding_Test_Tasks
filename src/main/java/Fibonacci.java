public class Fibonacci {

    public int iterativeFib(int n) {
       int a = 0;
       int b = 1;
       int c;

       if (n == 0) {
           return a;
       }

       for (int i = 2; i <= n; i++) {
           c = a + b;
           a = b;
           b = c;
       }
       return b;
    }

    public int recursiveFib(int n) {
        if (n <= 1) {
            return 1;
        }
        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }
}
