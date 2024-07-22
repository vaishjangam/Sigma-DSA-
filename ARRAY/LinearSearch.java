public class LinearSearch {
    
    public static int Linearsearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1; //if number is not in number list
    }
    public static void main(String args[]){
       
        int numbers[]={1, 2, 3, 4 , 5, 6};
        int key=2;

        int index=Linearsearch(numbers, key);
        if(index==-1){
            System.out.println("Key is not found");
        }else
        {
            System.out.println("Key is at index:"+index);
        }
    }
     
    

    
}
