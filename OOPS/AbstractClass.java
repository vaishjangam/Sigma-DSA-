public class AbstractClass {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();

        
    }
}

abstract class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
    abstract class walk();
}

class Dog extends Animal{
    void eat(){
        System.out.println("Eats bone");
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

