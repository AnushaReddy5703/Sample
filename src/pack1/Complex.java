package pack1;

import java.util.Scanner;

public class Complex {
	double real, imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to calculate the sum of two complex numbers
    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    // Method to calculate the difference of two complex numbers
    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }

    // Method to calculate the product of two complex numbers
    public static Complex multiply(Complex c1, Complex c2) {
        double realPart = c1.real * c2.real - c1.imaginary * c2.imaginary;
        double imaginaryPart = c1.real * c2.imaginary + c1.imaginary * c2.real;
        return new Complex(realPart, imaginaryPart);
    }


 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        Complex sum = Complex.add(complex1, complex2);
        Complex difference = Complex.subtract(complex1, complex2);
        Complex product = Complex.multiply(complex1, complex2);

        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
        System.out.println("Difference: " + difference.real + " + " + difference.imaginary + "i");
        System.out.println("Product: " + product.real + " + " + product.imaginary + "i");

        scanner.close();
	}

}
