package math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Operations {
    public static String findLongestWord(ArrayList<String> words){

        int size = 0;
        String longWord = "";
        boolean nonNull = !words.isEmpty();
        if (nonNull) {
            for (String word : words) {
                if (word.length() > size) {
                    size = word.length();
                    longWord = word;
                }
            }
        }return longWord;
    }

    public static boolean areLoginsUnique(List<String> logins){
        List<String>unique = logins.stream().distinct().toList();
        return logins.size()== unique.size();
    }
    public static String findPhone(HashMap<String,String> phonesBook, String name){
        return Optional.ofNullable(phonesBook.get(name)).orElse("Контакт не найден.");
       /* for (Map.Entry<String,String> entry: phonesBook.entrySet()){
            if (entry.getKey().equals(name)) {
                return entry.getValue();
            }
        } return "Контакт не найден.";*/
    }
}
