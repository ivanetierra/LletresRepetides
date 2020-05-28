import java.util.*;
public class fase2 {

	public static void main(String[] args) {
		String name = "Ivan2";
		char[] nameChar = name.toCharArray();
		ArrayList<Character> nameList = new ArrayList<Character>();
		
		for(char i : nameChar) {
			nameList.add(i);
		}
		
		for(char i: nameList) {
			if ("aeiou".contains((Character.toString(i)).toLowerCase())) {
				System.out.println(i+" VOCAL");
			}else if ("1234567890".contains((Character.toString(i)).toLowerCase())) {
				System.out.println(i+" Els noms de persones no contenen números!");
			}else
				System.out.println(i+" CONSONANT");
		}
	}

}


