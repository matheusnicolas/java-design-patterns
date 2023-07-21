package example.recursion;

public class SumOfNaturalNumbers {
    // 3
    // 3 + 2 + 1 == 6
    // 0
    public static void main(String[] args) {
        int result = sumOfNaturalNumbers(5);
        System.out.println(result);
    }


    public static int sumOfNaturalNumbers(int number) {
        if (number == 0) {
            return number;
        }
        return sumOfNaturalNumbers(number - 1) + number;
    }
}
