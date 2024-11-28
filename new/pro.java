import java.util.Scanner;

public class pro {
    public static void multiply( int a, int b){
        int product = a*b; 
        System.out.println("produvt is ;"+product);
        return; 
             
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        multiply(a, b);
       

    }
}
