package Mock;

public class nestedIfDivisibilityRule {

	public static void main(String[] args) {

		int a;
		a=24;
		if(a % 2 == 0)
		{
			if (a % 3 == 0)
			{
				System.out.println("This number is divisible by 2 & 3");
			}
			else
			{
				System.out.println("This number is divisible by 2 only");
			}
				
		}
		else if(a % 3== 0)
		{
			System.out.println(" This number is  divisible by  3");
		}
		
		else{
			System.out.println(" This number is not divisible by 2 & 3 ");
		}
	}

}
