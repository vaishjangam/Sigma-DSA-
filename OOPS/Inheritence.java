public class Inheritence {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
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

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("The fish can swims");
    }
}
