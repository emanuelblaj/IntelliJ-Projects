import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String t1 = "(<[ ]>)";
        String t2 = "[<incre>ment]";
        String t3 = "<increment>";
        String t4 = "()incre<>ment<>[]";

        String t5 = "<increment(";
        String t6 = "](incre]ment[";
        String t7 = "<i(ncr>e)ment";
        String t8 = "(<increment>";

        System.out.println(matchingParantheses(t1));
        System.out.println(matchingParantheses(t2));
        System.out.println(matchingParantheses(t3));
        System.out.println(matchingParantheses(t4));

        System.out.println(matchingParantheses(t5));
        System.out.println(matchingParantheses(t6));
        System.out.println(matchingParantheses(t7));
        System.out.println(matchingParantheses(t8));

    }

    public static boolean matchingParantheses(String s) {
        Stack<Character> stack  = new Stack<>();
        Map<Character, Character> blockSymbols = Map.of(')','(',
                ']', '[',
                '>', '<');

        for (int i = 0; i < s.length();i++) {
            char current = s.charAt(i);

            if(blockSymbols.containsValue(current)) {
                stack.push(current);
                continue;
            }

            if(blockSymbols.containsKey(current) && (stack.isEmpty() ||
                    blockSymbols.get(current) != stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
