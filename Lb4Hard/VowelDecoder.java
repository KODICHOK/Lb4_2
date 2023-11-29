package Lb4Hard;

public class VowelDecoder {
    public static String decodeVowels(String encodedString) {
        char[] charArray = encodedString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            switch (currentChar) {
                case '1':
                    charArray[i] = 'a';
                    break;
                case '2':
                    charArray[i] = 'e';
                    break;
                case '3':
                    charArray[i] = 'i';
                    break;
                case '4':
                    charArray[i] = 'o';
                    break;
                case '5':
                    charArray[i] = 'u';
                    break;
            }
        }
        return new String(charArray);
    }
}
