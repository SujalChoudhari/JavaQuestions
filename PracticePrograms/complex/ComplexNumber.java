package PracticePrograms.complex;

public class ComplexNumber {
    public double real;
    public double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        double real = this.real + complexNumber.real;
        double imaginary = this.imaginary + complexNumber.imaginary;
        System.out.println("Sum: " + real + " + " + imaginary + "i");
    }

    public void subtract(ComplexNumber complexNumber) {
        double real = this.real - complexNumber.real;
        double imaginary = this.imaginary - complexNumber.imaginary;
        System.out.println("Difference: " + real + " + " + imaginary + "i");
    }

    public void multiply(ComplexNumber complexNumber) {
        double real = this.real * complexNumber.real - this.imaginary * complexNumber.imaginary;
        double imaginary = this.real * complexNumber.imaginary + this.imaginary * complexNumber.real;
        System.out.println("Product: " + real + " + " + imaginary + "i");
    }

    public void divide(ComplexNumber complexNumber) {
        double real = (this.real * complexNumber.real + this.imaginary * complexNumber.imaginary)
                / (complexNumber.real * complexNumber.real + complexNumber.imaginary * complexNumber.imaginary);
        double imaginary = (this.imaginary * complexNumber.real - this.real * complexNumber.imaginary)
                / (complexNumber.real * complexNumber.real + complexNumber.imaginary * complexNumber.imaginary);
        System.out.println("Quotient: " + real + " + " + imaginary + "i");
    }

    public void display() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }

    public String toString() {
        return "Complex Number: " + real + " + " + imaginary + "i";
    }
}
