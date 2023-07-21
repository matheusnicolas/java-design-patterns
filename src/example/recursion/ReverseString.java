package example.recursion;

public class ReverseString {

    private static final String EMPTY = "";

    public static void main(String[] args) {
        String phrase = "it should reverse this string!";
        System.out.println(reverseString(phrase));
    }


    public static String reverseString(String input) {

        if (input.equals(EMPTY))
            return EMPTY;

        return reverseString(input.substring(1)) + input.charAt(0);
    }

    // hello

    // 5: "" + o
    // 4: o + l
    // 3: lo + l
    // 2: llo + e
    // 1: elloh
}
