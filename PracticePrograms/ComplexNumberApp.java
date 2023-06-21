package PracticePrograms;
import PracticePrograms.complex.ComplexNumber;
public class ComplexNumberApp {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(2, 3);
        ComplexNumber complexNumber2 = new ComplexNumber(4, 5);
        complexNumber1.display();
        complexNumber2.display();
        complexNumber1.add(complexNumber2);
        complexNumber1.subtract(complexNumber2);
        complexNumber1.multiply(complexNumber2);
        complexNumber1.divide(complexNumber2);
        System.out.println(complexNumber1.toString());
    }
}
