package wissen;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LongestEvenLength {
	public static void main(String[] args) {
		String s = "Be not afraid of greatness, some are born great, some achieve greatness, and some have greatness thrust upon them.";
//		s = s.replace(",", "");
		char[] charArr = s.toLowerCase().toCharArray();
		s = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList())
				.stream()
				.filter(c -> (c>='a' && c<='z') || c==' ')
                .map(String::valueOf)
				.collect(Collectors.joining());
		String ar[] = s.split(" ");
		String longest = "";
		for (String word : ar) {
			if (word.length() % 2 == 0 && word.length() > longest.length())
				longest = word;
		}
		System.out.println(longest);
	}
}
