public class Hollow_Rhombus_Pattern {
        public static void Hollow_Rhombus(int n){
            //outer loop
            for(int i=1;i<=n;i++){
                //for spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                //for stars 
                for(int j=1;j<=n;j++){
                    if(i==1 || i==n || j==1 || j==n){
                        System.out.print("*");
                    }else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            }
          
    public static void main(String args[]){
        Hollow_Rhombus(5);
    }
}
