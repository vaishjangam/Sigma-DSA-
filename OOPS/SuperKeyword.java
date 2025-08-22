public class SuperKeyword{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.sound();
        d1.PrintType();
    }
}

class Animal{
    String type = "Animal";

    Animal(){
        System.out.println("Animal constructor called");
    }

    void sound(){
        System.out.println("Animal makes a sound");
    }
   
}

class Dog extends Animal{
   String type = "Dog";

    Dog(){
        super();       //Parent class constructor called
        System.out.println("Dog constructor is called");
    }

    void sound(){
        System.out.println("Dog barks");
        super.sound();  //calling parent class method 
    }

    void PrintType(){
        System.out.println("Child type: " + type);
        System.out.println("Parent type: " + super.type);
    }
}