package function;

public class arr5 {
    public static void subarray(int number[]) {
        for( int i=0;i<number.length;i++){ 
            int cur= number[i];
            for( int j=i;j<number.length;j++){
                int end = number[j];
                for( int k=cur;k<=end;k++){
                    System.out.println(number[k]);
                }
                System.out.println();
                
             
          }   
          System.out.println();
         }

        
    }
    
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        subarray(number);
    }
}
            
