public class decimal {
    public static void bintodec(int binno){
        int myNum=binno;
        int dec=0;
        int pow=0;
        while(binno>0){
            int lastdigit =binno%10;
            dec =dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binno =binno/10;
        }
        System.out.println("decimal of"+myNum+"="+dec);
        
    }
    public static void main(String[] args) {
        bintodec(101);
        
    }
}
