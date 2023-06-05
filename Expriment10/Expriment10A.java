import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Exception Handling

public class Expriment10A{
    public static void main(String[] args) {
        FileReader fr;
        try {
            // fr = new FileReader("myfilewithnumber.txt");
            fr = new FileReader("myfile.txt");
            // fr = new FileReader("nofile.txt");
            BufferedReader br = new BufferedReader(fr);
            String potentialNumber = br.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } 



        try{
            int integer = Integer.parseInt("Hello");
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        try {
            int sum = 200 / 0;
        } catch (ArithmeticException e){
            e.printStackTrace();
        }


        try{
            int[] arr = {20,30,40};
            System.out.println(arr[69]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}