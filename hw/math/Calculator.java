package math;

public class Calculator {
    public static int sum(int...num){
        int sum = 0;
        for (int i = 0; i < num.length ; i++) {
            sum+=num[i];
        }
        return sum;
    }

    public static int multiply(int...num){
        int mult = 1;
        for (int i = 0; i < num.length ; i++) {
            mult *= num[i];
        }return mult;
    }

    public static int max(int...num){
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max){
                max = num[i];
            }

        }return max;
    }
}
