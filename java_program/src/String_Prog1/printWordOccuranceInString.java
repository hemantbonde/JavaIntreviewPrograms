package String_Prog1;

import java.util.HashSet;

public class printWordOccuranceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to tyss";
		String[] str = s.split(" ");
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<str.length;i++) {
			set.add(str[i]);
		}
		for(String word:set) {
			int count=0;
			for(int i=0;i<str.length;i++) {
			if(word.equals(str[i])) {
				count++;
			}
			}
			System.out.println(word+" : "+count);
		}

	}

}