package hashmp;
import java.util.HashMap;

public class hash {
    public static boolean hashmap1(String a) {
        HashMap<Character, Integer> hs = new HashMap<>();
        int i;
        int count = 0;
        for (i = 0; i < a.length(); i++) {

            if (hs.containsKey(a.charAt(i))) {
                return false;
            } else {
                hs.put(a.charAt(i), count);

            }

        }
        return true;
    }

}
