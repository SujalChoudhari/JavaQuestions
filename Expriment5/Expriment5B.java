import java.util.Scanner;

public class Expriment5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side, l,b:");
        int side = sc.nextInt();

        int l = sc.nextInt();
        int b = sc.nextInt();

        int areaSquare = area(side);
        int recSquare = area(l,b);

        System.out.println("Area of Square: "+ areaSquare);
        System.out.println("Area of Rectangle: "+ recSquare);
    }

    private static int area(int side){
        return side * side;
    }

    private static int area(int length, int bredth){
        return length * bredth;
    }
}
