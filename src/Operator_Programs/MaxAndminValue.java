package Operator_Programs;

public class MaxAndminValue {
    public static void main(String[] args) {
        int add = Addition();
        System.out.println("add "+add);
        int sub = Substraction();
        System.out.println("sub "+sub);
        int mul = product();
        System.out.println(" mul "+mul);
        int div = division();
        System.out.println("div " +div);
        //max value
        int[] arr = {add,mul, sub, div};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i] > max)
                max= arr[i];
        }
        System.out.println("maximum number is "+max);

        int min= arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("minimum number is "+min);
    }
    static int Addition() {
        int a = 20;
        int b = 20;
        int c = 30;
        int sum = a + b * c;
        return  sum;
    }
    static int Substraction() {
        int a = 10;
        int b = 20;
        int c = 30;
        int sum =c +  a / b;
        return  sum;
    }
    static int product() {
        int a = 10;
        int  b = 60;
        int c = 40;
        int sum = (a) * (b + c);
        return  sum;
    }
    static int division() {
        int a = 40;
        int  b = 30;
        int c = 70;
        int sum = a * b +c;
        return  sum;


    }
}
