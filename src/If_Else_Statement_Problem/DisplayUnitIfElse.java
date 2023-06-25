package If_Else_Statement_Problem;

import java.util.Scanner;

public class DisplayUnitIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("Single unit");
        }
        else if (num == 10) {
            System.out.println("Two unit");
        }
        else if (num == 100) {
            System.out.println("Three unit");
        }
        else if (num == 1000) {
            System.out.println("Four unit");
        }
        else if (num == 10000) {
            System.out.println("Five unit");
        }
        else if (num == 100000) {
            System.out.println("six unit");
        }
        else if (num == 1000000) {
            System.out.println("Seven unit");
        }
        else if (num == 10000000) {
            System.out.println("Eight unit");
        }
        else if (num == 100000000) {
            System.out.println("Nine unit");
        }
        else {
            System.out.println("Invalid Number");
        }
    }
}


