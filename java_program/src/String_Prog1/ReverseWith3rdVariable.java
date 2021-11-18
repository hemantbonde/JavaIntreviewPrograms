package String_Prog1;

public class ReverseWith3rdVariable {

	public static void main(String[] args) {
		// Reverse String  with 3rd variable from given String
		String s="tyss";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
