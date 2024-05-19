
public class EvenWords {
    public void printEvenWords(String words) {
        String[] wordArray = words.split(" ");

        for (String word : wordArray) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
