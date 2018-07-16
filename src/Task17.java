import java.util.ArrayList;
import java.util.Arrays;

public class Task17 {

	public static void main(String[] args) {

		ArrayList<String> input = new ArrayList<>(Arrays.asList("aDs", "add", "dd", "eee"));
		System.out.println("original: " + input);

		// your code
		for (int i = 0; i < input.size(); i++) {
			// String original = input.get(i);
			// String result = original.toUpperCase();
			// input.set(i, result);

			String mod = input.get(i).toUpperCase();
			input.set(i, mod);
		}

		System.out.println("result: " + input);
	}

}