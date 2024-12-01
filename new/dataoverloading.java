public class dataoverloading {
    public static int over(int a,int b){
        return a+b;

        
    }
    public static float over(float a,float b,float c) {
        return a+b+c;
        
    }
    public static void main(String[] args) {
        System.out.println(over(2,5));
        System.out.println(over(2.4f,4.f,6.6f));
        
    }
}
    

