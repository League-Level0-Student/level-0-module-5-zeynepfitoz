
public class Fibonacci {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;

		for (int i = 0; i < 11; i++) {
			int third = first + second;
			first = second;
			second = third;

		
		System.out.println(second);
		}
}
}
