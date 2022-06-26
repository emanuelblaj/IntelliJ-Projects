import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
         String s1 = "HellO";
         String s2 = " there is a quiet Mouse";
         String s3 = "I am happy";

         findNumberofVowelsAndConsonants(s1);
         findNumberofVowelsAndConsonants(s2);
         findNumberofVowelsAndConsonants(s3);

        System.out.println();
        System.out.println("WITH STREAMS: ");
         findNumberOfVowelsAndConsonantsStreams(s1);
         findNumberOfVowelsAndConsonantsStreams(s2);
         findNumberOfVowelsAndConsonantsStreams(s3);
    }

    private static void findNumberOfVowelsAndConsonantsStreams(String input) {

        String vowels = "aeiouy";
        String normalized = input.toLowerCase();

        List<Integer> letters = normalized.chars()
                .filter(Character::isAlphabetic)
                .boxed()
                .collect(Collectors.toList());

        long vowelsCount = letters.stream()
                .filter(c ->vowels.indexOf(c) != -1)
                .count();

        long consonantCount = letters.stream().count() - vowelsCount;

        System.out.println("There are " + vowelsCount + " vowels in " + input);
        System.out.println("There are " + consonantCount + " consonants in " + input);
        System.out.println();
    }

    private static void findNumberofVowelsAndConsonants(String input) {
        int vowelsCount = 0;
        int consonantsCount= 0;
        String vowels = "aeiouy";
        String normalized = input.toLowerCase().trim();
        char[] normalizedArray = normalized.toCharArray();

        for (char c: normalizedArray) {
            if(vowels.indexOf(c) != -1) {
                vowelsCount++;
            } else if(c != ' ') {
                consonantsCount++;
            }
        }
        System.out.println("There are " + vowelsCount + " vowels in  " + input);
        System.out.println("There are " + consonantsCount + " consonants in " + input);
        System.out.println();;
    }
}
