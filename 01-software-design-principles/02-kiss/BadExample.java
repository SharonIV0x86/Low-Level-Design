class NumberUtils {
    public static boolean isEven(int number) {
        // Using unnecessary logic to determine evenness
        boolean isEven = false;

        if (number % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }

        return isEven;
    }
}

public class BadExample {
    public static void main(String[] args) {
        System.out.println("4 is even: " + NumberUtils.isEven(4));
        System.out.println("5 is even: " + NumberUtils.isEven(5));
    }
}