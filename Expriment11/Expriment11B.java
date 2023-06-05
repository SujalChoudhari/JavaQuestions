package Expriment11;

// print /*/*/*/*/* using 2 child threads (Thread class)
class PrintStar extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("/*");
        }
    }
}

public class Expriment11B {
    public static void main(String[] args) {
        PrintStar p1 = new PrintStar();
        PrintStar p2 = new PrintStar();

        p1.start();
        p2.start();
    }
}