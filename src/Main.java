import mine.jkchoi.algorithm.BinarySearcher;

public class Main {

    public static void main(String[] args) {

        final int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        System.out.println(BinarySearcher.search(primes, 67));
    }
}
