import java.util.ArrayList;
import java.util.Arrays;

public class Task19 {

	public static void main(String[] args) {

		ArrayList<String> src = new ArrayList<>(
				Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));

		ArrayList<String> dest = new ArrayList<String>();

		for (int i = 0; i < src.size(); i++) {

			String string1 = src.get(i);

			if (string1.length() == 4) {
				dest.add("****");
				dest.add(string1);

			} else {
				dest.add(string1);

			}

		}
		System.out.print(dest);

		// dest.addAll(src);

	}
}
