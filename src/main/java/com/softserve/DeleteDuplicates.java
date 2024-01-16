package com.softserve;

import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicates {

	private DeleteDuplicates() {
	}

	public static String deleteDuplicates(String input) {
		if (input == null) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		Set<Character> uniqueList = new HashSet<>(input.length());
		for (int i = 0; i < input.length(); i++) {
			char current = input.charAt(i);
			if (uniqueList.add(current)) {
				result.append(current);
			}
		}
		return result.toString();
	}

}
