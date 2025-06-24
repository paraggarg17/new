package function;

public class 2Darr {
    public static void main(strin[]arr){
        Scanner SC = new Scanner(System.in);
        int rows = sc.newInt();
        int cols = sc.newInt();

        int[][] number = new int [rows][cols];
        for( int i=0;i<rows;i++){
            for(int  j=0; j<cols; j++){
                number[i][j] = sc.nextInt();


            }
        }
        for( int i=0; i<rows; i++){
            for( int j=0; j<cols;j++){
                System.out.println( number[i][j]);
            }
            System.out.println();
        }

}    
    

}
     

