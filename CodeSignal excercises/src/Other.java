import java.util.HashSet;

public class Other {

    /**
     * Given a string, find out if there's repeat  characters in it.
     */

    static boolean findRepeat(String s) {

        String[] splited = s.split("");
        HashSet<String> h = new HashSet<>();
        for (int i = 0; i < splited.length; i++) {
            if (h.contains(splited[i])) {
                return true;
            }
            h.add(splited[i]);
        }
        return false;
    }
}
