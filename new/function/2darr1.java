package function;

public class 2darr1 {
    public static void main(string[]arr){
        Scanner sc = new Scanner(System.in);
        int rows = sc.newInt();
        int cols = sc.newInt();

        int[][] number = new int [rows][cols];
        //input
        for( int i=0;i<rows;i++){
            for(int  j=0; j<cols; j++){
                number[i][j] = sc.nextInt();
            }
        }
        //output
        int x = sc.newInt();
         for( int i=0;i<rows;i++){
            for(int  j=0; j<cols; j++){
                if( number[i][j]==x){
                    System.out.println(number[i][j] );
                }
            }
            System.out.println();
        }





    }
    
    
}
