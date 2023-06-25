package For_Loop;

public class ReverseIntegerNumber {
    public static void main(String[] args) {

        int number = 34, reverse = 0;
        for ( ;number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);

    }
}
