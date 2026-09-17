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