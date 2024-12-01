public class binomial {
    public static int fact(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
            
        }
        return f;
        
    }
    
    public static int biocoff(int n,int r){
        int fa_n =fact(n);
        int fa_r =fact(r);
        int fa_nmr =fact(n-r);
        int biocoff = fa_n/(fa_r*fa_nmr);
        return biocoff;

    }
    public static void main(String[] args) {
        System.out.println(biocoff(5,2));
        

        
        
    }
     
}
