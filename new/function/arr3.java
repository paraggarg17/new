package function;

public class arr3 {
    public static int getlargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for( int i=0; i<number.length;i++){
            if (largest<number[i]){
                largest = number[i];
            }
            if (smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println( smallest);
        return largest;
        
    }
        public static void main(String[] args) {
        int number []={1,2,3,4,6,5};
        System.out.println(getlargest(number));

        
    }
}
