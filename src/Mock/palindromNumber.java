package Mock;

public class palindromNumber {

	public static void main(String[] args) {

		int n = 1221;
		int a = n;
		int t = 0;
		int r;
		
		while(a!=0)
		{
			r=a%10;
			t=t*10+r;
			a=a/10;
		}
		System.out.println(t);
		
		if(n==t)
		{
			System.out.println("It is a Palindrome Number");
		}
		else
		{
			System.out.println("It is not a Palindrome Number");
		}
	}

}
