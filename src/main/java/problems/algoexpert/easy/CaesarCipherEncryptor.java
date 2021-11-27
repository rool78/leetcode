package problems.algoexpert.easy;

public class CaesarCipherEncryptor {

    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor("abc", 1));
    }

    public static String caesarCypherEncryptor(String str, int key) {
        int newKey = key % 26;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int newLetterIndex = alphabet.indexOf((str.charAt(i)) + newKey);
            char newLetter = alphabet.charAt(newLetterIndex % 26);
            result[i] = newLetter;
        }
        return String.valueOf(result);
    }

}
