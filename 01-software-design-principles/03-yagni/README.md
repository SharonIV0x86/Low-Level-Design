# YAGNI: You Aren't Gonna Need It

**Core idea:** "Always implement things when you actually need them, never when you just foresee that you need them." In simple terms, don't add functionality until it's necessary. Avoid building features that you think you might need in the future. This keeps the codebase clean and reduces unnecessary complexity.

## Example Scenario

Assume you've been asked to build a note-taking app that allows users to create a note and view notes.

Now, you start thinking ahead: "What if later they want categories? Or tagging? Or syncing with Google Drive? I should prepare for that!" This creates a lot of unnecessary complexity and wastes time.

## Importance

- Reduced waste
- Simplified codebase
- Faster development

## When NOT to Use YAGNI

- **When the requirements are well-known:** if a feature is guaranteed and soon to be implemented, preparing for it now might be more efficient. For example:
  - You're writing a messaging service that currently supports only text, but your product team has committed to image support in two sprints.
  - Designing your data model to handle attachments now might save significant refactoring later.
- **Performance-Critical Areas:** in systems where performance is a first-class concern, avoiding YAGNI might actually help. Preemptively building and testing real-world usage patterns can catch bottlenecks early.

## Code Examples

### Bad: building features "just in case"

The requirement is only create + view notes, but speculative classes for tagging, categories, and cloud sync are written (and never used).

```java
class Note {
    String title;
    String content;
}

// Built "just in case" - nobody asked for these yet
class Tagging {
    void addTag(Note note, String tag) {
        // stub
    }
}

class Categorization {
    void addCategory(Note note, String category) {
        // stub
    }
}

class GoogleDriveSync {
    void sync() {
        // stub
    }
}

public class BadExample {
    public static void main(String[] args) {
        Note note = new Note();
        note.title = "Shopping list";
        note.content = "Milk, eggs, bread";

        Tagging tagging = new Tagging();                    // never used
        Categorization categories = new Categorization();   // never used
        GoogleDriveSync sync = new GoogleDriveSync();       // never used

        // The only required feature:
        System.out.println("Created note: " + note.title);
        System.out.println(note.content);
    }
}
```

Full file: [`BadExample.java`](BadExample.java)

### Good: only what is needed today

Only the required create + view flow exists. Extra features can be added when (and if) they are actually requested.

```java
class Note {
    String title;
    String content;
}

public class GoodExample {
    public static void main(String[] args) {
        Note note = new Note();
        note.title = "Shopping list";
        note.content = "Milk, eggs, bread";

        System.out.println("Created note: " + note.title);
        System.out.println(note.content);

        // Tags, categories, cloud sync? Not yet - YAGNI.
    }
}
```

Full file: [`GoodExample.java`](GoodExample.java)