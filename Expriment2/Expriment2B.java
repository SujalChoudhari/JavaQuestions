import java.util.Scanner;

public class Expriment2B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][5];

		System.out.println(
				"Roll No |   Subject1    |   Subject2    |   Subject3    |");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
				arr[i][4] += arr[i][j];
			}
			arr[i][4] -= arr[i][0];
		}

		System.out.println(
				"	Roll No |   Subject1    |   Subject2    |   Subject3    |	Total	|");
		System.out.println(
				"	----------------------------------------------------------------------");

		int max = 0;
		int maxRoll = 0;
		for (int i = 0; i < 5; i++) {
			int total = arr[i][4];
			if (total > max) {
				max = total;
				maxRoll = arr[i][0];
			}
			System.out.println(
					"\t|" +
							arr[i][0] +
							"\t|\t" +
							arr[i][1] +
							"\t|\t" +
							arr[i][2] +
							"\t|\t" +
							arr[i][3] +
							"\t|\t" +
							total +
							"\t|\t");
		}

		System.out.println(
				"RollNo: " + maxRoll + " scored the maximum. i.e. " + max);
	}
}
