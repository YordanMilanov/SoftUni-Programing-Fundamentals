import java.util.*;

public class wordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //creating linkedHashMap -> ordering by addition
        LinkedHashMap<String, List<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            // we read from the console the word with its synonym
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            //putIfAbsent adds a new List associated with the word only if the word does not already exist in the LinkedHashMap
            words.putIfAbsent(word, new ArrayList<>());
            //then we add the synonym to List which is associated with the word(key).
            words.get(word).add(synonym);
        }
        //iterate for each word in the List -> words created in the beggining
        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            //we create an empty string (this is done like that because we need to remove the last character (",")
            String output = "";
            // we add the key word (the main word)
            output += (entry.getKey() + " - ");
            // loop is created to add each synonym of the main word to the string
            for (String word : entry.getValue()) {
                output += (word + ", ");
            }
            //the output String is edited so it does not have the last "," in it.
            //it is done by the substring method -> nameOfTheEditedString.substring(Begin index, Last index)
           String editedOutput = output.substring(0, output.length() - 2);
            System.out.println(editedOutput);
        }
    }
}
