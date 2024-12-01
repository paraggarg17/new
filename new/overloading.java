public class overloading {
    public static int over(int a,int b){
        return a+b;

        
    }
    public static int over(int a,int b,int c) {
        return a+b+c;
        
    }
    public static void main(String[] args) {
        System.out.println(over(2,5));
        System.out.println(over(2,4,6));
        
    }
}
