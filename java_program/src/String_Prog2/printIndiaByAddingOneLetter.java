package String_Prog2;

public class printIndiaByAddingOneLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India";
	    String rev = "";
	    
		for(int i=0;i<=s.length()-1;i++) 
		{
			rev=rev+s.charAt(i);
			System.out.println(rev);
		}
	}

}