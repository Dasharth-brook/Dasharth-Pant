public class Q28 {

    static String language = "English";

    void countWords() {
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        int count = words.length;

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Number of Words: " + count);
    }

    public static void main(String[] args) {

        Q28 w = new Q28();
        w.countWords();
    }
}