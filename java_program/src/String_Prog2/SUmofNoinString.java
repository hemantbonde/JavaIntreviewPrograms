package String_Prog2;

public class SUmofNoinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a1b2c3";     
		int sum = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}
