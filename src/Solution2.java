import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // char[] arr = str.toCharArray();
        for(int i = 0; i<=str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)) {
                System.out.println("palindrome");
                break;
            }
            else{
                System.out.println("try another keyword");
                break;
            }
        }
    }
}