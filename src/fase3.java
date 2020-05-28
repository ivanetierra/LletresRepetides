import java.util.ArrayList;
import java.util.HashMap;
public class fase3 {

	public static void main(String[] args) {
		String name = "Ivannnnnniii";
		char[] nameChar = name.toCharArray();
		ArrayList<Character> nameList = new ArrayList<Character>();
		
		for(char i : nameChar) {
			nameList.add(i);
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char i: nameList) {
			if (map.containsKey(i)) {
				map.replace(i, (map.get(i))+1);
			}else{
				map.put(i,1);
			}
			
			
		}
		
		System.out.println(map);
	}

}