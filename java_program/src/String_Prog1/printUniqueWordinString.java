package String_Prog1;

import java.util.LinkedHashSet;

public class printUniqueWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to tyss tyss";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		for(String word:set) {
			int count = 0;
			for(int i=0;i<str.length;i++) {
				if(word.equals(str[i])) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(word+" ");
			}
		}

	}

}
