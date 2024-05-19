
public class SwapCharacterPairs {
    public static String swapPair(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        char[] charArray = string.toCharArray();

        for (int i = 0; i < charArray.length - 1; i += 2) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }

        return new String(charArray);
    }

}
