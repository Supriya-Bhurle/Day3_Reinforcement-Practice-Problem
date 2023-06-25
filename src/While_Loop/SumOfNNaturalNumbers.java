package While_Loop;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int n = 20, sum = 0, i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(
                "Sum of natural numbers using while loop is:"
                        + " " + sum);
    }
    }

