public class DecToBin {
    public static void dectobin(int decNum) {
        int MyNum= decNum;
        int pow =0;
        int binNum =0;
        while (decNum>0) {
            int rem =decNum%2;
            binNum =binNum +(rem*(int)Math.pow(10,pow));
            pow++;
            decNum = decNum/2;
            
        }
        System.out.println("Binary of" +MyNum+ "=" +binNum);

        
    }
    public static void main(String[] args) {
        dectobin(5);
        
    }
}
