public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.Sum(1, 2));
        System.out.println(calc.Sum(14.53f, 12.53f));
        System.out.println(calc.Sum(3, 5, 87));
}
}
class Calculator{
    int Sum(int a, int b){
        return a+b;
    }

    float Sum(float a, float b){
        return a+b;
    }

    int Sum(int a, int b, int c){
        return a+b+c;
    }
}
