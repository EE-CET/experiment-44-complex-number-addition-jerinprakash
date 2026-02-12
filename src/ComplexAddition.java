import java.util.Scanner;

class Complex {

    int real;
    int imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    static Complex add(Complex c1, Complex c2) {
        int sumReal = c1.real + c2.real;
        int sumImag = c1.imag + c2.imag;
        return new Complex(sumReal, sumImag);
    }

    void print() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        Complex result = Complex.add(c1, c2);

        result.print();

        sc.close();
    }
}
