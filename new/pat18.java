public class pat18 {
    public static void hop(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j<=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        hop(4);
        
    }
    
}
