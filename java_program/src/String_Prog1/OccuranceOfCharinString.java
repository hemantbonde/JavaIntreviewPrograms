package String_Prog1;

import java.util.HashSet;

public class OccuranceOfCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="tyss";
		//Step 1:Create set collection & add all char to String to set
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		//step 2: Comparing each char in set with given String
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					//if it is matching increment the count
					count++;
				}
			}
			//printing Character along with occurrence i.e count
			System.out.println("Count of "+ch+" : "+count);
		}

	}

}
