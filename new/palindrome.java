import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int temp = n;
      
        while(n>0){
           int rev =n%10;
           sum =sum*10+rev;
           n=n/10;
           

        }
        if(temp==sum){
            System.out.println("it is a palidrome");
        }
        else{
            System.out.println("Not a palidome");
        }
    }
}
