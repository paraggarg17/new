package function;

public class arr4 {
     public static void printpair(int number[]){
        int tp =0;
        for( int i=0; i<number.length; i++){
            int curr = number[i];
            for( int j=i+1; j<number.length; j++){
                System.out.println("("+curr+","+number[j]+")");
                tp++;

            }
            System.out.println();
        }
        System.out.println("total number ="+tp);

    }
    
    public static void main(String[] args) {
        int number[]={2,4,5,6};
        printpair(number);

        
    }
    
}
