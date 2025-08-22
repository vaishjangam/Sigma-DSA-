public class Interface2 {
    public static void main(String[] args) {
        Bear b1 = new Beer();
        b1.eats();
    }
    
}

interface Herbivores{
    void eats();

}

interface Carnivorous{
    void eats();

}

class Bear implements Herbivores, Carnivorous{
    public void eats(){
        System.out.println("Bear is Herbivores and Carnivorous");
    }
}
