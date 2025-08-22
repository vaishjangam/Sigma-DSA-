public class StaticKeyword {

    //static variable
    static String clgname = "abc";

    //instance varible
    int roll_number;
    String name;

    //constructor
    StaticKeyword(int r, String n){
       roll_number = r;
        name = n;

    }

    //static method
    static void ChangeClgName(String newName){
        clgname = newName;
    }

    //display method non-static
    void display(){
        System.out.println(roll_number + " " + name + " " + clgname );
    }

    //Static block
    static{
        System.out.println("Static block executed,  class is loaded");
    }



    public static void main(String[] args) {
        StaticKeyword s1 = new StaticKeyword(1, "Vaishnavi");
        StaticKeyword s2 = new StaticKeyword(2, "Riya");

        //before changing college name
        s1.display();
        s2.display();

        // changing static variable using static method
        StaticKeyword.ChangeClgName("xyz");

        //after changing collge name
        s1.display();
        s2.display();


    }

}
