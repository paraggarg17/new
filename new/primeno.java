import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=2;
        while (c<n) {
            if(n%c==0){
                System.out.println("not a prime");
                
            }
            c++;
        }
        if (c==0) {
            System.out.println("prime no");
        }
        else{
            System.out.println("not a prime");
        }
    }
}
