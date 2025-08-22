public class MethodOverriding {
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();

        
    }
}

class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Eats bone");
    }
}
