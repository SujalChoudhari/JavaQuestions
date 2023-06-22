public class Finally {
    public static void main(String[] args){
		int a = 10;
		int b = 0;
		int[] c =  {4};
		System.out.println("Running!");
		try{
			System.out.println("Computing...");
			int k = a/b;
			System.out.println("Computed!");
			System.out.println("Fetching...");
			int d = c[99];
		}catch (ArithmeticException e){
			System.out.println("Error: Cannot divide by Zero");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Cannot Access That Element");
		}
		finally {
			System.out.println("Completed!");
		}
		
	}
}
