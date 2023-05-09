import java.util.Scanner;

public class SumOfSeries{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("The pattern is:");

for (int i = 1; i <= 7; i++){
 int num = i;
for (int j = 1; j<= i; j++){
 System.out.print(num+ " ");
num--;
}
System.out.println();
}