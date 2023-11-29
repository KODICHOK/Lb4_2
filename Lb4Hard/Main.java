package Lb4Hard;

public class Main {
    public static void main(String[] args) {
        String[] encodedStrings = {"t2st3ng", "h4ll5", "c1s2", "r1d1r", "b1n1n1", "h1nn1h", "l4ll3p4p", "g5ys"};
        decodeAndPrint(encodedStrings);
        String encodedString = "ufttjoh";
        String decodedString = EnglishDecoder.decodeEnglish(encodedString);
        System.out.println(decodedString);
    }

    public static void decodeAndPrint(String[] encodedStrings) {
        for (String encodedString : encodedStrings) {
            String decodedString = VowelDecoder.decodeVowels(encodedString);
            System.out.println(decodedString);
        }
    }
}


