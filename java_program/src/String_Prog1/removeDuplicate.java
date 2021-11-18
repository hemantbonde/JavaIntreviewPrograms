package String_Prog1;

import java.util.LinkedHashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tyss";
		//Linked hash set used to get char in sequence and remove duplicate obj/chara\
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		//for each loop to print all char
		for(Character ch:set) {
			System.out.print(ch);
		}

	}

}
