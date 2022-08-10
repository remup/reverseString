package reverseString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1 = "M@#ou^nta%&in";

		String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}";

		List<String> string = new ArrayList<>();
		List<String> reverse = new ArrayList<>();

		List<Integer> intPosition = new ArrayList<>();

		for (int i = 0; i < s1.length(); i++) {

			string.add(String.valueOf(s1.charAt(i)));

			if (specialCharacters.contains(Character.toString(s1.charAt(i)))) {
				intPosition.add(i);

			}

		}

		intPosition.forEach(a -> System.out.println(a));
		reverse = string.stream().filter(a -> !specialCharacters.contains(a)).collect(Collectors.toList());
		Collections.reverse(reverse);

		System.out.println(reverse);

		for (int j = 0; j < reverse.size(); j++) {

			if (intPosition.contains(j)) {
				reverse.add(j, Character.toString(s1.charAt(j)));
			}

		}

		System.out.println(reverse);
		System.out.println(reverse.stream().collect(Collectors.joining()));
	}
}
