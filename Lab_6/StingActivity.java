package Lab_6;
public class StingActivity {

    
    public static class BinaryStringToInt {

        // Метод для перетворення двійкового рядка в int
        public static int binaryStringToInt(String s) {
            if (s == null) {
                throw new NullPointerException("Input string is null.");
            }

            if (!s.matches("[01]+")) {
                throw new IllegalArgumentException("Input string is not a valid binary number.");
            }

            return Integer.parseInt(s, 2);  // Перетворення з двійкової системи в int
        }
    }

    // Клас для підрахунку слів у реченні
    public static class SentenceWordCounter {

        // Метод для підрахунку слів у реченні
        public static int countWords(String sentence) {
            if (sentence == null) {
                throw new NullPointerException("Sentence is null.");
            }

            String[] words = sentence.split("\\s+"); //розбиття речення на слова 
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
        // Тестування двійкових рядків
        String[] testCases = {"10101", "111", "1001", null, "1021", "Hello", "100011"};

        for (String testCase : testCases) {
            try {
                
                int result = BinaryStringToInt.binaryStringToInt(testCase);
                System.out.println("Binary: " + testCase + " -> Int: " + result);
            } catch (IllegalArgumentException | NullPointerException e) {
                System.out.println("Error: " + e.getMessage() + " for input \"" + testCase + "\"");
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
            try {
                
                int result = SentenceWordCounter.countWords(sentence);
                System.out.println("Sentence: \"" + sentence + "\" -> Word count: " + result);
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage() + " for input \"" + sentence + "\"");
            }
        }
    }
}
