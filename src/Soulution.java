import java.util.Scanner;
public class Soulution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Array size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = size-1; i >= 0; i--) {
            System.out.print(numbers2[i]);
        }
    }
}