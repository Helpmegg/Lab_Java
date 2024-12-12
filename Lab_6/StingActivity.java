package Lab_6;

public class StingActivity {

    public static class BinaryStringToInt {

        // Метод для перетворення двійкового рядка в int
        public static int binaryStringToInt(String s) {
            if (s == null) {
                System.out.println("Error: Input string is null.");
                return -1; // Повернення значення для обробки помилки
            }

            if (!s.matches("[01]+")) {
                System.out.println("Error: Input string \"" + s + "\" is not a valid binary number.");
                return -1; // Повернення значення для обробки помилки
            }

            return Integer.parseInt(s, 2);  // Перетворення з двійкової системи в int
        }
    }

    public static class SentenceWordCounter {


        public static int countWords(String sentence) {
            if (sentence == null) {
                System.out.println("Error: Sentence is null.");
                return 0; // Повернення 0 слів для обробки помилки
            }

            String[] words = sentence.split("\\s+"); // Розбиття речення на слова
            int wordCount = 0;

            for (String word : words) {
                if (word.matches("[a-zA-Z0-9]+")) {
                    wordCount++;
                }
            }

            return wordCount;
        }
    }

    public static void main(String[] args) {
   
        String[] testCases = {"10101", "111", "1001", null, "1021", "Hello", "100011"};

        for (String testCase : testCases) {
            int result = BinaryStringToInt.binaryStringToInt(testCase);
            if (result != -1) { 
                System.out.println("Binary: " + testCase + " -> Int: " + result);
            }
        }
        System.out.println();

        String[] testSentences = {
            "The user with the nickname koala757677 this month left 3 times more comments than the user with the nickname croco181dile181920 4 months ago",
            "",
            null,
            "1234 abc123 ABC DEF"
        };

        for (String sentence : testSentences) {
            int result = SentenceWordCounter.countWords(sentence);
            System.out.println("Sentence: \"" + sentence + "\" -> Word count: " + result);
        }
    }
}
