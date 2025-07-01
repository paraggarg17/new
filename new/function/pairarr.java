public class pairarr {
    public static void printpair(int number[]){
        for( int i=0; i<number.length; i++){
            int curr = number[i];
            for( int j=0; j<number.length; j++){
                System.out.println("("+curr+","+number[i]+")");

            }
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        int number[]={2,4,5,6};
        printpair(number);

        
    }
}
