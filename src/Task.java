import java.util.ArrayList;

public class Task {

	public static void main(String[] args){
		
		
	String input = "     kAsPAars      uzvards uzvards2  hhhhh kjjj";
	String[] chars = input.split(" ");
	
	ArrayList <String> target = new ArrayList<>();
	
	
	
	for (String s : chars) {
		if (s.length() != 0) {
			
			target.add(s);
			System.out.println("part: '" + target.get(target.size()) + "'");
			
			
//			if (target.length == part) {
//				System.out.println("Extend..");
//				String[] newArray = new String[target.length + 1];
//				System.arraycopy(target, 0, newArray, 0, target.length);
//				target = newArray;		
//			}
			
		}
	}

	// System.out.println("parts: " + parts);
	
	for (int i = 0; i < target.size(); i++) {
		String elem = target.get(0);
		
		if (i == 0) {
			
				elem = elem.substring(0, 1).toUpperCase() 
					+ elem.substring(1, elem.length()).toLowerCase() ;
			
		} else {
			elem = elem.toUpperCase();
		}
		target.set(i, elem);
	}
	
	for (String t : target) {
		System.out.println("t: '" + t + "'");
	}
	
}}
