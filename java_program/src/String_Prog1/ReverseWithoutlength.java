package String_Prog1;

public class ReverseWithoutlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hemant";
		String rev="";
		int count = s.compareTo(rev);
		for(int i=count-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
