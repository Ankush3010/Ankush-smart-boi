package Mock;

public class arrayOfPalindromeNumber {

	public static void main(String[] args) {

		int[] n = { 102, 123, 1331 };
		int r;
		int t = 0;
		for (int i = 0; i < n.length; i++) {
			int a = n[i];
			while (a != 0) {
				r = n[i] % 10;
				t = t * 10 + r;
				a = n[i] / 10;				
			}
			
			if(n[i]==t)
			{
				System.out.println(t);
			}
			
			
		}

	}
}
