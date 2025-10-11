import java.util.*;

public class Day_4_AnagramGroup {
    public static List<List<String>> anagramGroups(String [] strs){
        Map<String, List<String>> anagramGroup = new HashMap<>();

        for(String originalWord: strs){
            char[] charArr = originalWord.toCharArray();
            Arrays.sort(charArr);
            String sortedWord = new String(charArr);

            anagramGroup.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(originalWord);
        }

        return new ArrayList<>(anagramGroup.values());
    }
}
