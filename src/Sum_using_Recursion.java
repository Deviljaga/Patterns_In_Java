class Solution3 {
    public int sum(int n){
        if(n == 0) return 0;
    
    return n+sum(n-1);
}
}
public class Sum_using_Recursion {

    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
        int result = s3.sum(24);
        System.out.println(result);
       
    }
}
