package Basic;

public class palindromeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4554;
		int b=n;
		int rev=0;
		while(b!=0) {
			rev=rev*10+b%10;
			b=b/10;
		}
		System.out.println(n);
		if(n==rev) {
			System.out.println(rev+" :is pallindrome Number");
		}
		else {
			System.out.println(n+" :is not pallindrome Number");
		}
	}

}
