// Print the sum, difference, and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation, whose real and imaginary parts are entered by the user.
import java.util.*;
public class ComplexnumberSum {
    public static void main(String[] args) {
        Complex c = new Complex(4, 6);
        Complex d = new Complex(3, 3);
        Complex e = Complex.Add(c, d);
        Complex f = Complex.Difference(c, d);
        Complex g = Complex.Product(c,d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
        
    }
}

class Complex{
    int real;
    int imaginary;

    public Complex(int r, int i){
        real = r;
        imaginary = i;
    }

    public static Complex Add(Complex a, Complex b){
        return new Complex((a.real+b.real), (a.imaginary + b.imaginary));
    }

    public static Complex Difference(Complex a, Complex b){
        return new Complex((a.real - b.real), (a.imaginary - b.imaginary));
    }

    public static Complex Product(Complex a, Complex b){
        return new Complex((a.real*b.real- a.imaginary * b.imaginary),
        (a.real*b.real- a.imaginary * b.imaginary));
    }

    public void printComplex(){
        if(real ==0 && imaginary != 0){
            System.out.println(real);
        }else if(real != 0 && imaginary == 0){
            System.out.println(imaginary);
        }else{
            System.out.println(real + "+" + imaginary + "i");
        }
    }
}
