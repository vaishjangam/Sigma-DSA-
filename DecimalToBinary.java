public class DecimalToBinary {
    public static void DecToBin(int Dec){
        int myNum=Dec;
        int pow=0;
        int binNum=0;

        while(Dec>0){

            int rem=Dec%2;
            binNum=binNum+( rem* (int)Math.pow(10, pow));
            pow++;
            Dec=Dec/2;
        }
        System.out.println("Binary Form of  " + myNum + " is: "+binNum);
    }
    public static void main(String args[]){

        DecToBin(12);

    }
    
}
