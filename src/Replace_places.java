import java.util.*;
public class Replace_places {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String str = sc.nextLine();
        String result = "";
        for(int i = 0; i <= str.length()-1; i++) {
            if(str.charAt(i) == ' ') {
                result = result+'_';
            }
            else {
                result = result+str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
