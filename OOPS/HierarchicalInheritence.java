public class HierarchicalInheritence {
    public static void main(String[] args) {
        Shark s1 = new Shark();
        s1.shape();

        Human h1 = new Human();
        h1.leg = 2;
        System.out.println(h1.leg);
        
    }
}

class Animal{
     void eat() {
      System.out.println("Eats");
   }

   void breathe() {
      System.out.println("Breathes");
   }
}

class Fish extends Animal{
    void swim() {
      System.out.println("The fish can swims");
    }
}

class Tuna extends Fish{
    void shape(){
        System.out.println("Streamlined shape");
    }

}
class Shark extends Tuna{
    int size; 
}

class Bird extends Animal{
    void fly(){
        System.out.println("They can fly");
    }
}
class Peacock extends Bird{
    void color(){
        System.out.println("They can fly");
    }
}
class Mammal extends Animal{
    int leg;
}
class Dog extends Mammal{
    String breed;
}
class Cat extends Dog{
    int leg;
}
class Human extends Mammal{
    void Diet(){
        System.out.println("They are omnivores");
    }
}