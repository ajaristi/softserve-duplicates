package com.softserve;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DeleteDuplicatesTest {

	@Test
	void deleteDuplicatesTypical() {
		assertThat(DeleteDuplicates.deleteDuplicates("AABBCCD112233")).isEqualTo("ABCD123");
	}

	@Test
	void deleteDuplicatesNull() {
		assertThat(DeleteDuplicates.deleteDuplicates(null)).isNull();
	}

	@Test
	void deleteDuplicatesEmpty() {
		assertThat(DeleteDuplicates.deleteDuplicates("")).isEmpty();
	}

	@Test
	void deleteDuplicatesSpaces() {
		assertThat(DeleteDuplicates.deleteDuplicates("AA BB cd1245")).isEqualTo("A Bcd1245");
		assertThat(DeleteDuplicates.deleteDuplicates(" AA BB cd1245")).isEqualTo(" ABcd1245");
	}

	@Test
	void deleteDuplicatesSpecialCharacters() {
		assertThat(DeleteDuplicates.deleteDuplicates("AABB##$$aaádD124\\\\5"))
			.isEqualTo("AB#$aádD124\\5");
	}

	@ParameterizedTest
	@CsvSource({
		"aaAA,aA",
		"A,A",
		"Test task: Given a simple String AABBCCD112233. All you need is to return a new String that will not contain any duplicates. The code should be clean readable and optimized. Also we expect to see test coverage with a different test cases. Please publish your code on GitHub and send us a link,Test ak:GivnmplSrgABCD123.youdwhcbzxfPH"
	})
	void deleteDuplicatesMoreSamples(String input, String expected) {
		assertThat(DeleteDuplicates.deleteDuplicates(input)).isEqualTo(expected);
	}

}