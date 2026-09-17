# KISS: Keep It Simple, Stupid

**Core idea:** simplicity should be a key goal in design and unnecessary complexity should be avoided. In simple terms, use the simplest possible solution that works. Avoid clever, convoluted code.

## Importance

- Easier debugging
- Improved readability
- Better maintainability
- Faster development

## Code Examples

### Bad: needlessly convoluted

The boolean's initial value and the `if/else` re-assignment add noise to a trivially simple check.

```java
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
```

Full file: [`BadExample.java`](BadExample.java)

### Good: simplest solution that works

The whole check collapses into a single expression.

```java
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
```

Full file: [`GoodExample.java`](GoodExample.java)