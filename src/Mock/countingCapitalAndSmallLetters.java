package Mock;

public class countingCapitalAndSmallLetters {

	public static void main(String[] args) {
		int upper=0,down=0,space=0,num=0,symbol=0;
		char c;
		String s1 = "My Name is Ankush ////]]]//@2123";
		for (int i=0;i<s1.length();i++)
		{
		 c=s1.charAt(i);
			if(c>='A' && c<='Z')
			{
				upper++;
			}
			
			else if(c>='a' && c<='z')
			{
				down++;
			}
			
			else if(c==' ')
			{
				space++;
			}
			else if(c>='0' && c<='9')
			{
				num++;
			}
			else
			{
				symbol++;
			}
			
		}
		System.out.println("UpperCase = " +upper);
		System.out.println("LowerCase = " +down);
		System.out.println("Space = " +space);
		System.out.println("Number = " +num);
		System.out.println("Symbol = " +symbol);
		
		for(int i =0;i<=255;i++)
		{
			System.out.println((char)i+"="+i);
		}
	}

}
