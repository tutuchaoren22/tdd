import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_return_none_when_given_none() {
        String stringOfNone = "";
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convertString(stringOfNone);
        String expected = "";
        assertEquals(result, expected);
    }

    @Test
    void should_throw_exception_when_given_null() {
        Mommifier mommifier = new Mommifier();
        assertThrows(RuntimeException.class, () -> {
            mommifier.convertString(null);
        });
    }

    @Test
    void should_return_itself_when_given_strings_with_no_repeat_vowels() {
        String stringOfNoRepeatVowels = "abcde";
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convertString(stringOfNoRepeatVowels);
        String expected = "abcde";
        assertEquals(result, expected);
    }

    @Test
    void should_return_itself_when_given_strings_with_repeat_vowels_less_than_30_percent() {
        String stringOfRepeatVowels = "aabcdfhtysb";
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convertString(stringOfRepeatVowels);
        String expected = "aabcdfhtysb";
        assertEquals(result, expected);
    }

    @Test
    void should_insert_mommy_when_given_strings_with_repeat_vowels_more_than_30_percent() {
        String stringOfRepeatVowels = "aaabcdee";
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convertString(stringOfRepeatVowels);
        String expected = "amommyamommyabcdemommye";
        assertEquals(result, expected);
    }
}
