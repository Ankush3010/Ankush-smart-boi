package Mock;

public class ifElseWithStatic extends child {
	
	public static void method1()
	{
		System.out.println("This is Method 1");
	}
	public static void method2()
	{
		System.out.println("This is Method 2");
	}
	
	public static void method3() {
		//display();
	//	System.out.println("Child--If Else"   );
		int a=20, b= 30;
		if (a>=b)
		{
			ifElseWithStatic.method1();
			
		}
		else
		{
			ifElseWithStatic.method2();
			//method2();
		}
	
	}

}
