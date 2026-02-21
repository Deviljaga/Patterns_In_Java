class Recursion2 {
    public int print(int N){
        if(N==0) return 0;
        return N + print(N-1);
    }
}

public class Sum_first_N_Number_using_recursion {
    public static void main(String[] args) {
        Recursion2 r2 = new Recursion2();
        int result = r2.print(4);
        System.out.println(result);
    }
}