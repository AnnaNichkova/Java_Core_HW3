import java.util.*;

public class Task1 {
    public static void main (String args[]) {
        String[] words = {"January", "February", "March", "April", "January", "May", "June", "February", "July", "January"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // 2 задание
        Phonebook pb = new Phonebook();

        pb.add("Fedorov", "89991113322");
        pb.add("Sergeeva", "89884443211");
        pb.add("Nichkova", "89764568877");

        System.out.println(pb.get("Fedorov"));
    }
}
