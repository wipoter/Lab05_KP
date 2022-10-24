import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortManager {
    public static class Inner_class1 implements Comparator<String> {
        private static List<Character> characters;
        public int compare(String t1, String t2) {
            characters = new ArrayList<>(
                    Arrays.asList('q','w','r','t','p','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'));
            int iT1 = 1,iT2 = 1;
            for(;iT1 < t1.length();iT1++)
                if(characters.contains(t1.charAt(iT1)))
                    break;
            for(;iT2 < t2.length();iT2++)
                if(characters.contains(t2.charAt(iT2)))
                    break;
            characters = new ArrayList<>();
            return Integer.compare(Character.compare(t1.charAt(iT1), t2.charAt(iT2)) , 0);
        }
    }
}
