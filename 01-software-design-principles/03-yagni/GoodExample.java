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