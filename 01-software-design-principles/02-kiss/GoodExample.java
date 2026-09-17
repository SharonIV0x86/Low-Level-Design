class NumberUtils {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

public class GoodExample {
    public static void main(String[] args) {
        System.out.println("4 is even: " + NumberUtils.isEven(4));
        System.out.println("5 is even: " + NumberUtils.isEven(5));
    }
}