import java.util.Scanner;

public class rectangle {
    public static void rect(int a,int b){
        int c = a*b;
        System.out.println("Aera of rectangle:"+c);
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        rect(a,b);

        
    }
}
