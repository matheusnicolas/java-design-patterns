package example.recursion;

public class DecimalToBinary {

    public static void main(String[] args) {
        String result = decimalToBinary(233, "");
        System.out.println(result);
    }

    public static String decimalToBinary(int decimal, String result) {

        if (decimal == 0) {
            return result;
        }

        result = (decimal % 2) + result;

        return decimalToBinary(decimal / 2, result);
    }
}
