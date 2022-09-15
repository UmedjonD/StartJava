public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        double result = 0;
        char sign = '^';

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = (double) a / b;
        } else if (sign == '^') {
            result = Math.pow(a, b);
        } else {
            result = a % b;
        }
        
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}