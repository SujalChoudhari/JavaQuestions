package Expriment11;


class FibonacciGenerator extends Thread {
    public int[] fibonacci;
    FibonacciGenerator(int number){
        this.fibonacci = new int[number];
    }

    public void run(){
        for(int i = 0; i < this.fibonacci.length; i++){
            if(i == 0 || i == 1){
                this.fibonacci[i] = 1;
            } else {
                this.fibonacci[i] = this.fibonacci[i-1] + this.fibonacci[i-2];
            }
        }    
    }
}

class Input {
    
    private int number;
    
    Input(int number){
        this.number = number;
    }

    public void generateFibonacci(){
        FibonacciGenerator fib = new FibonacciGenerator(this.number);
        fib.start();
        try {
            fib.join();
            System.out.println("Fibonacci Series:");
            for(int num: fib.fibonacci){
                System.out.print(num + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Expriment11C {
    public static void main(String[] args) {
        Input input = new Input(10);
        input.generateFibonacci();
    }
}
