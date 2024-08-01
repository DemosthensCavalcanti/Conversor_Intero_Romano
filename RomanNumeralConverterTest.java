import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralConverterTest {

    @Test
    public void testIntToRoman() throws InvalidRomanNumeralException {
        assertEquals("MCMXCV", RomanNumeralConverter.intToRoman(1995));
        assertEquals("I", RomanNumeralConverter.intToRoman(1));
        assertEquals("IV", RomanNumeralConverter.intToRoman(4));
        assertEquals("IX", RomanNumeralConverter.intToRoman(9));
        assertEquals("LV", RomanNumeralConverter.intToRoman(55));
        assertEquals("MMXXIV", RomanNumeralConverter.intToRoman(2024));
    }

    @Test
    public void testRomanToInt() throws InvalidRomanNumeralException {
        assertEquals(1995, RomanNumeralConverter.romanToInt("MCMXCV"));
        assertEquals(1, RomanNumeralConverter.romanToInt("I"));
        assertEquals(4, RomanNumeralConverter.romanToInt("IV"));
        assertEquals(9, RomanNumeralConverter.romanToInt("IX"));
        assertEquals(55, RomanNumeralConverter.romanToInt("LV"));
        assertEquals(2024, RomanNumeralConverter.romanToInt("MMXXIV"));
    }

    @Test
    public void testInvalidRomanNumeral() {
        assertThrows(InvalidRomanNumeralException.class, () -> {
            RomanNumeralConverter.romanToInt("IIII");
        });
        assertThrows(InvalidRomanNumeralException.class, () -> {
            RomanNumeralConverter.romanToInt("IC");
        });
        assertThrows(InvalidRomanNumeralException.class, () -> {
            RomanNumeralConverter.romanToInt("A");
        });
        assertThrows(InvalidRomanNumeralException.class, () -> {
            RomanNumeralConverter.romanToInt("");
        });
    }
}