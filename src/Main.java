class Recursion {
    public void printName(String name,int count,int n){
        if(count==n) return;

        System.out.print(name);
        printName(name,count+1,n);
    }
}

public class Main{
    public static void main(String[] args) {
        Recursion r = new Recursion();
        // int n=10;
        // String name = "jaga";
        // int count = 0;
        r.printName("jaga ",0,5);
    }
}
