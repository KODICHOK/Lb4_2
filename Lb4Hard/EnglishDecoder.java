package Lb4Hard;

public class EnglishDecoder {
    public static String decodeEnglish(String encodedString) {
        char[] charArray = encodedString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            if (isEnglishLetter(currentChar)) {
                charArray[i] = getPreviousEnglishLetter(currentChar, i > 0 ? charArray[i - 1] : '\0');
            }
        }

        return new String(charArray);
    }

    public static boolean isEnglishLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static char getPreviousEnglishLetter(char currentChar, char previousChar) {
        if (previousChar == currentChar) {
            return currentChar;
        }

        int index = ((int) Character.toLowerCase(currentChar) - 'a' + 26) % 26;

        char previousLetter = (char) ((index - 1 + 26) % 26 + 'a');

        if (Character.isUpperCase(currentChar)) {
            previousLetter = Character.toUpperCase(previousLetter);
        }

        return previousLetter;
    }
}
