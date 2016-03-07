import java.util.*;

public class HashThings {
	
	public static void main(String [] args) {
		
		String [] stuff = {"keys", "wallet", "condoms", "mints", "pots", "pans", "wallet"};
		List<String> list = Arrays.asList(stuff);
		
		System.out.printf("%s ", list);
		System.out.println();
		
		Set<String> set = new HashSet<String> (list);
		System.out.printf("%s ", set);
	}

}
