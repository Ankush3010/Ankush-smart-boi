package Mock;

public class palindromString {

	public static void main(String[] args) {

		String s1 = "tenet";
		String[] s2 = s1.split("");     //A,N,K,U,S,H
		String rev = "";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev = rev + s2[i];
		}
		System.out.println(rev);
		
		System.out.println(s1.equalsIgnoreCase(rev));
		
	}

}
