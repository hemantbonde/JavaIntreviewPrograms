package Array_program;

public class StringWIthMinLengthinArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"Hi","Hello","bye","p","tyss","mango"};
		String max=s[0];
		for(int i=1;i<s.length;i++)
		{
			if(s[i].length()<max.length())
			{
				max=s[i];
			}
		}
		
		for(int i=0;i<s.length;i++) {
			if(max.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}

	}

}
