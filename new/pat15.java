public class pat15 {
    public static void numb(int n) {
        for(int i=1;i<=n;i++){
            for( int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
            
        
        }
    }
    public static void main(String[] args) {
        numb(4);
        
    }
    
}
