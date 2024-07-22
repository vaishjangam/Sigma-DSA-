import java.util.*;
public class TrappingWater {

    public static int TrappingWaterArray( int height[] ){
       int n = height.length;
        //calculate Left max boundary for array
        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            LeftMax[i] = Math.max(height[i], LeftMax[i-1] );
        }

        //Calculate Right max boundary for array
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            RightMax[i] = Math.max(height[i], RightMax[i+1] );
        }

        int Trapped_water = 0;
        //loop
        for (int i=0; i< n-1; i++){
             //Trapped water = min(max left boundary, max right boundary) - height
              int Waterlevel = Math.min (LeftMax[i],  RightMax[i]);

              //Water trapped = water level - height *width (width =1 can be negligeable)
              Trapped_water += Waterlevel - height[i] ;
        }
        return Trapped_water ;

        
        
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 6, 6, 3, 2, 5};
        System.out.println(TrappingWaterArray(height));
    }
    
}
