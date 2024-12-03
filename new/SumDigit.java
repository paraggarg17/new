import java.util.Scanner;

public class SumDigit {
    public static int dig(int n) {
        int sum =0;
        while(n>0){
            int c=n%10;
            sum =sum +c;
            n=n/10;
            System.out.println(sum);

        }
        return sum;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number");
        int n = sc.nextInt();
        dig(n);
        
    }
}
