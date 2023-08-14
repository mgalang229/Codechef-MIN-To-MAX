import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			int min = Integer.MAX_VALUE;
			for (int x : a) {
				min = Math.min(min, x);
			}
			int counter = 0;
			for (int x : a) {
				if (x > min) {
					counter++;
				}
			}
			System.out.println(counter);
		}
		fs.close();
	}
}
