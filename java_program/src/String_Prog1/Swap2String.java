package String_Prog1;

public class Swap2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";//length =3
		String s2="xyz";//length=3
	
		System.out.println("Before Swaping : "+s1+"  "+s2);
		//
		s1=s1+s2;//abcxyz lenth=6
		s2=s1.substring(0,s1.length()-s2.length());//(0,3)=0,1,2 not take 3rd char
		s1=s1.substring(s2.length());
		System.out.println("After Swaping : "+s1+"  "+s2);
	}
}
