package String_Prog2;

public class SeperateCharNoSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a1b$c2%";
		String alpha = "";
		String num = "";
		String spl = "";
		for(int i=0;i<s.length();i++) {
			//if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122))
				if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z'))
				
			{
				alpha=alpha+s.charAt(i);
			}
			//else if(s.charAt(i)>=48&&s.charAt(i)<=57) 
				else if(s.charAt(i)>='0'&&s.charAt(i)<='9') 
			{
				num=num+s.charAt(i);
			}
			else {
				spl=spl+s.charAt(i);
			}
		}
		System.out.println("Alpha "+alpha);
		System.out.println("number "+num);
		System.out.println("Special char "+spl);
	}

}
