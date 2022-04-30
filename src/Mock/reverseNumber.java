package Mock;

public class reverseNumber {

	public static void main(String[] args) {

		
		int n = 123;
		int a = n;
		int t = 0;
		int r;

		r = n % 10;
		System.out.println(r);
		t = t * 10 + r;
		System.out.println(t);
	     a = a / 10;
		System.out.println(a);
		System.out.println("********************");
		r = a % 10;
		System.out.println(r);
		t = t * 10 + r;
		System.out.println(t);
		a = a / 10;
		System.out.println(a);
		System.out.println("********************");
		r = a % 10;
		System.out.println(r);
		t = t * 10 + r;
		System.out.println(t);
		a = a / 10;
		System.out.println(a);
		System.out.println("***********************");
	System.out.println("Reverse Number=" + t);

	}
}
