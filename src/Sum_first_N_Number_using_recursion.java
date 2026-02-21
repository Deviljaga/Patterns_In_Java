class Recursion2 {
    public void print(int N){
        int sum = 0;
     if(N==0) return;

     return sum = sum+print(N-1);
    
    }
     
}




public class Sum_first_N_Number_using_recursion {
    public static void main(String[] args) {
        Recursion2 r2 = new Recursion2();
        r2.print(4);
    }
}
