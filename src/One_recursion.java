class Recursion1 {
    public void print(int count, int n) {
        if (count - 1 == n)
            return;
        System.out.print(count + " ");
        print(count + 1, n);
    }
}

public class One_recursion {
    public static void main(String[] args) {
        Recursion1 re = new Recursion1();
        re.print(1, 10);
    }
}
