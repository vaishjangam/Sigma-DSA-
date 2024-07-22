public class Butterfly_Pattern {
    public static void Butterfly(int n){
        //For first Half
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){            //stars
                System.out.print("*");
            }

            for(int j=1;j<=2*(n-i); j++){       //Spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){            //stars
                System.out.print("*");
            }
            System.out.println();
        }

        //second half
        for(int i=n; i>=1; i--){
            for(int j=1;j<=i;j++){            //stars
                System.out.print("*");
            }

            for(int j=1;j<=2*(n-i); j++){       //Spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){            //stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Butterfly(4);
    }
}
