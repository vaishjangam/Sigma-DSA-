public class Half_Pyramid_With_Number {

    public static void Half_Pyramid(int n){
        for(int i=1; i<=n;i++){                 //rows
            for(int j=1; j<=n-i+1; j++){        //number
                System.out.print(j+"");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        Half_Pyramid(5);
    }
    
}
