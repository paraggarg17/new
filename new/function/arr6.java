package function;

public class arr6 {
    public static void maxsubarray(int number[]) {
      
        for(int i=0;i<number.length;i++){
            int start = i;
            for ( int j=i; j<number.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){
                    
                    System.out.println(number[k]+" ");
                   
                }
                
                System.out.println();
                
            }
            
           
        }

        
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        maxsubarray(number);
    }
    
}
