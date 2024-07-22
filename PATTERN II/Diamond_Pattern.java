public class Diamond_Pattern {
    public static void Diamond(int n){

        //first half
        for(int i=1;i<=n;i++){     //inner loop
            for(int j=1;j<=n-i;j++){               //for spaces      
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){            //for stars
                System.out.print("*");
            }
            System.out.println();
        }

        //for second half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    public static void main(String args[]){
        Diamond(5);
    }
}
