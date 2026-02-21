class Solution6 {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1)+fib(n-2);
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        Solution6 s6 = new Solution6();
        int result = s6.fib(6);
        System.out.println(result);
    }
}
