public class Solid_Rhombus_Pattern {

    public static void Solid_Rhombus(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //loop for stars 
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        Solid_Rhombus(5);
    }
    
}
