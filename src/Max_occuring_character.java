import java.util.Scanner;
public class Max_occuring_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your character");
        String str = sc.next();
        int max = 0;
        char chr = ' ';
        for(int i = 0 ; i<=str.length()-1;i++) {
            int count = 0;
            for(int  j = 0;j<=str.length()-1;j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                } 
                if(count>max) {
                    max =  count;
                    chr = str.charAt(i);
                }
            }
           
        }
         System.out.println(chr);
    }
}
