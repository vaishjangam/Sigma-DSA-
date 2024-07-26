public class PrintAllLetter{
    public static void CharAt(String Full_name){
        for(int i=0; i<Full_name.length();i++){
            System.out.print(Full_name.charAt(i) + " ");
        }
    }
    public static void main(String args[]){
        String name = "Vaishnavi";
        String Surname = "Jangam";
        String Full_name =name + " " + Surname;
        
        CharAt(Full_name);
    }
}