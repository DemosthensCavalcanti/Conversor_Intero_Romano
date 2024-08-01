import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {
    private static final Map<Character, Integer> romanToIntMap = new HashMap<>();
    private static final int[] intValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    static {
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
    }

    public static String intToRoman(int num) throws InvalidRomanNumeralException {
        if (num <= 0) {
            throw new IllegalArgumentException("O número deve ser maior que zero.");
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intValues.length; i++) {
            while (num >= intValues[i]) {
                num -= intValues[i];
                sb.append(romanNumerals[i]);
            }
        }
        return sb.toString();
    }

    public static int romanToInt(String s) throws InvalidRomanNumeralException {
        if (s == null || s.isEmpty()) {
            throw new InvalidRomanNumeralException("A entrada não pode ser nula ou vazia.");
        }

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!romanToIntMap.containsKey(currentChar)) {
                throw new InvalidRomanNumeralException("Caractere inválido: " + currentChar);
            }
            int current = romanToIntMap.get(currentChar);
            int next = i + 1 < s.length() ? romanToIntMap.get(s.charAt(i + 1)) : 0;
            if (current < next) {
                sum -= current;
            } else {
                sum += current;
            }
        }

        if (String.valueOf(sum).equals(s)) {
            throw new InvalidRomanNumeralException("O número romano já é um número inteiro.");
        }

        return sum;
    }
}