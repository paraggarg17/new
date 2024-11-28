public class factoial {
    public static int fact(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
            System.out.println(f);
        }
        return f;
        
    }
    public static void main(String[] args) {
        fact(3);
        
    }
}
