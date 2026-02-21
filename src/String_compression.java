import java.util.Scanner;

public class String_compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        int count = 1;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result = result + str.charAt(i);
                count = 1;
            }

        }
        System.out.println(result);
    }
}
