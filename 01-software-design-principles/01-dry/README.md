# DRY: Don't Repeat Yourself

**Core idea:** every piece of knowledge must have a single, unambiguous, authoritative representation within a system. In simple terms, avoid duplication of logic or code. Repeating code makes the system hard to maintain and error-prone - if a change is required, you might forget to update all occurrences.

## Importance

- Reduces redundancy
- Easier maintenance
- Single point of change

## Applying DRY in Practice

- Identify repetitive code and replace it with a single, reusable code segment.
- Extract common functionality into methods or utility classes.
- Leverage libraries and frameworks when available.
- Refactor duplicate logic regularly across classes or layers.

## When NOT to Use the DRY Principle

- **Premature Abstractraction:** don't extract common code too early.
  - At first glance, two code blocks might look similar, but they could change in different ways later.
  - Extracting them into a shared method can create unnecessary coupling between unrelated parts.
- **Performance-Critical Code:** don't apply DRY to performance-sensitive code if it causes inefficiency.
  - Sometimes repeating optimized low-level logic is faster than calling a generalized, reusable method.
  - Function calls, indirection, or generic wrappers might reduce performance or block compiler optimizations like inlining.
- **Sacrificing Readability:** if extracting repeated code makes the code less readable, prefer clarity over DRYness.
- **Legacy Codebases:** don't refactor for DRY's sake in legacy code unless necessary and well-tested.
  - Legacy code might not have tests or complete documentation. Introducing DRY by extracting shared logic can accidentally change behavior.
  - Refactoring legacy code safely often follows the "leave it alone unless you must touch it" rule.

## Code Examples

### Bad: duplicated inline logic

The area calculation is repeated twice, so changing the formula means editing multiple spots.

```java
public class BadExample {
    public static void main(String[] args) {
        int length1 = 10, width1 = 5;
        int area1 = length1 * width1;
        System.out.println("Area1: " + area1);

        int length2 = 8, width2 = 4;
        int area2 = length2 * width2;
        System.out.println("Area2: " + area2);
    }
}
```

Full file: [`BadExample.java`](BadExample.java)

### Good: logic extracted once, reused everywhere

The calculation lives in exactly one place. Change it once and both call sites stay in sync.

```java
class AreaCalculator {
    public static int calculateArea(int length, int width) {
        return length * width;
    }
}

public class GoodExample {
    public static void main(String[] args) {
        int area1 = AreaCalculator.calculateArea(10, 5);
        int area2 = AreaCalculator.calculateArea(8, 4);

        System.out.println("Area1: " + area1);
        System.out.println("Area2: " + area2);
    }
}
```

Full file: [`GoodExample.java`](GoodExample.java)