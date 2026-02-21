class Solution4 {
    public long fact(long n){
        if(n==0) return 1;
        return n * fact(n-1);
    }
}



public class Factorial_Recursion {
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        long result = s4.fact(20);
        System.out.println(result);
    }
}
