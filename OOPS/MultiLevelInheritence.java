public class MultiLevelInheritence {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.legs = 4;

        }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
