public class Reader {
    public String name = "";
    public int capacity = 0;
    public String[] book;
    public int count = 0;

    public Reader(String nam) {
        System.out.println("A new reader is created!");
        name = nam;
        capacity = 2;
        book = new String[capacity];
    }

    public Reader(String nam, int cap) {
        System.out.println("A new reader is created!");
        name = nam;
        capacity = cap;
        book = new String[capacity];
    }

    public void addBook(String book_name) {
        if (count < capacity) {
            book[count] = book_name;
            count++;
        } else {
            System.out.println("No more capacity");
        }
    }

    public void updateCapacity(int update) {
        String[] old = new String[capacity];
        for (int i = 0; i < count; i++) {
            old[i] = book[i];
        }
        capacity = update;
        book = new String[capacity];
        for (int i = 0; i < count; i++) {
            book[i] = old[i];
        }
        System.out.println("Capacity has changed to " + update);
    }

    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books:");
        if (count == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("Book " + (i + 1) + ": " + book[i]);
            }
        }
    }
}
