public class BinToDec {
    public static void binToDec(int binNum){
        int myNumber=binNum;
        int power=0;
        int decNum=0;
        while( binNum > 0 ){
            int lastDigit=binNum%10;
            decNum=decNum+( lastDigit* (int)Math.pow(2, power));
            
            power++;
            binNum=binNum/10;

        }
        System.out.println("Decimal of " + " "+ myNumber +" " + "is:" +decNum);

    }
    public static void main(String args[]){
        binToDec(111);
    
    }
    
}
