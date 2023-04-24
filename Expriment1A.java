public class Expriment1A {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number % 2 == 0) {
            if (2 <= number && number <= 5) {
                System.out.println("Not Weird");
            } else if (6 <= number && number <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}