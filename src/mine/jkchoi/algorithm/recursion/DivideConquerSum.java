package mine.jkchoi.algorithm.recursion;

/*
f(n) = 1 +  2 + 3 + ... + (n-1) + n

n 이 짝수인 경우
f(n) = (1 + 2 + ... + n/2) + (((n/2) + 1) + ((n/2) + 2) + ... + ((n/2) + (n/2))
     = (1 + 2 + ... + n/2) * 2 + ((n/2) * (n/2))
     = f(n/2) * 2 + ((n^2) / 4)

n 이 홀수인 경우
f(n) = f(n-1) + n
 */
public class DivideConquerSum {
    public static int sum(int input) {
        if (input == 0) {
            return 0;

        } else if (input % 2 > 0) {
            return input + sum(input - 1);

        } else {
            return sum(input / 2) * 2 + (input * input / 4);
        }
    }
}
