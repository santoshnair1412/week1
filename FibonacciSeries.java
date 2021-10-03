package week1day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstnum = 0, secondnum = 1, output, i;
		for (i = 0; i <= 6; i++) {
			output = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = output;
			System.out.println(output);
		}
	}
}
