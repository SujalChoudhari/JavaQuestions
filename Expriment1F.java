import java.util.*;

public class Expriment1F {
    public static void main(String[] args) {
        System.out.println("Enter A number: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextFloat();

        float sum = 0;
        for (double i = 1; i <= num; i++) {
            sum += 1 / (i * i);
        }

        System.out.println(sum);
    }
}