import java.util.ArrayList;

public class fase4 {

	public static void main(String[] args) {
		String name = "Ivan";
		String surname = "Elizalde";
		name = name.toUpperCase();
		surname = surname.toUpperCase();
		
		char[] nameChar = name.toCharArray();
		ArrayList<Character> nameList = new ArrayList<Character>();
		
		char[] surnameChar = surname.toCharArray();
		ArrayList<Character> surnameList = new ArrayList<Character>();
		
		for(char i : nameChar) {
			nameList.add(i);
		}
		for(char i : surnameChar) {
			surnameList.add(i);
		}
		
		nameList.addAll(surnameList);
		
		System.out.println(nameList);
	}

}