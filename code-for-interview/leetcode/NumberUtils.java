package leetcode;

public class NumberUtils {
    public static boolean isDivisibleBy(int num1,int num2) {
        if(num1 == 0 || num1 == num2) return true;
        return num1 == (num1/num2) * num2;
    }

    public static void main(String args[]) {
        System.out.println(NumberUtils.isDivisibleBy(num1, num2));
    }
}
