public class patt17 {
    public static void cl(int n){
        for( int i=1;i<=n;i++){
            for( int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        cl(5);
        
    }
    
}