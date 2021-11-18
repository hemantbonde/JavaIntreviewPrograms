package Basic;

public class PallindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="amma";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println(s+" : palindrome string");
		}
		else {
			System.out.println(s+" : palindrome string");
		}

	}

}
