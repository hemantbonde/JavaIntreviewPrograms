package Array_program;

public class StringWIthMinLengthinArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		//not a good approach
		String s[]= {"hiee","bye","Hemant","vishwas","BalaKrishna"};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].length()>s[j].length()) {
					String temp = s[i];
					s[i]=s[j];
					s[j]=temp;
				
				}
			}
		}
		System.out.println(s[0]);
	}


}
