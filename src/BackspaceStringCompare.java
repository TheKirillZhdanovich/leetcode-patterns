import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "#adc"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a#c", "b"));
    }

    public static boolean backspaceCompare(String s, String t) {
        if(Objects.equals(processing(s), processing(t))) {
            return true;
        }else {
            return false;
        }
    }

    public static String processing(String s) {
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                if(list.size() != 0) {
                    list.remove(list.size() - 1);
                }
            }
            else {
                list.add(s.charAt(i));
            }
        }

        return list.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
