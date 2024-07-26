public class CompareString {
    public static void main(String args[]){
        String S1 = "Vaishnavi";
        String S2 = "Vaishnavi";
        String S3 = new String("Vaishnavi");
        // if(S1==S2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal!!!");
        // }
        // output:Strings are equal

        //  if(S1==S3){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal!!!");
        // }
        // output:Strings are not equal

        if(S1.equals(S3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
