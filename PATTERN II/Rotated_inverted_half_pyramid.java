class Rotated_inverted_half_pyramid{
    public static void half_pyramid(int n){
        for(int i=1;i<=n;i++){            //row or line
            for(int j=1;j<=n-i;j++){        //spaces
                System.out.print(" ");
            }
                for(int j=1;j<=i;j++){      //stars
                    System.out.print("*");
                }
             System.out.println();
           
        }
    }
    public static void main(String args[]){
        half_pyramid(4);
    }
}