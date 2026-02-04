public class Inverse_pyramid2 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = n; i>=1;i--) {
            for(int j = n; j>=1;j--){
                if(i>=j){
                    System.out.print("* ");
                }
                    else{
                        System.out.print(" ");
                    }
                
            }

            System.out.print("\n");
        }
    }
}
