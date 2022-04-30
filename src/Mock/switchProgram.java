package Mock;

public class switchProgram extends ifElseWithStatic  {

	public static void main(String[] args) {
		display();
	//	method1();
	//	method2();
		method3();
		int a=20, b =2 ,c;
		char oprator= '+';
		
		switch(oprator)
		{
		case '-':
			c= a-b;
			System.out.println("Subtraction =" + c);
			break;
		case '+':
			c=a+b;
			System.out.println("Addition =" + c);
			break;
		case '*':
			c=a*b;
			System.out.println("Multiplication =" + c);
			break;
		case '/':
			c=a/b;
			System.out.println("Division =" + c);
			break;
			default:
				System.out.println("Invalid Oprator");
		}

	}

}
