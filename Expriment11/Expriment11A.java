package Expriment11;
/**
 * Write a program to print a table of 5,7,13 using Thread.
 */

class Table extends Thread {
    int num;
    Table(int num) {
        this.num = num;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}

public class Expriment11A {
    public static void main(String[] args) {
        Table t1 = new Table(5);
        Table t2 = new Table(7);
        Table t3 = new Table(13);

        t1.start();
        t2.start();
        t3.start();
    }
}