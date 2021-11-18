package String_Prog1;

import java.util.LinkedHashSet;

public class printUniqueCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tyss";
		//linkedhashset used to get char in sequence and remove duplicate obj
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					//if it is matching increment the count
					count++;
				}
			}
			System.out.println("Unique  Char  with sequence given  in String : ");
			//if count is more than one then char is duplicate
			if(count==1) {
			System.out.print(ch);
		}
		}
	}
}
