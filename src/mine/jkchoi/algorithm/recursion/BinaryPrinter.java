package mine.jkchoi.algorithm.recursion;

public class BinaryPrinter {
    public static String print(int input) {
        if (input < 2) {
            return String.valueOf(input);
        }

        String value = String.valueOf(input % 2);
        String output = print(input / 2);

        return output + value;
    }
}
