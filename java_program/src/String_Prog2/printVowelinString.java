package String_Prog2;

public class printVowelinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hemant";
		//String name=s.tolowerCase() change s to name in if
		for(int i=0;i<s.length();i++) {
			//if char given Upper case
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				//dont print from new variable instead of that use original string
				System.out.println(s.charAt(i));
			
			}
			
		}

	}

}
