//WARMUP 12APR2022
public class BookCase {
    private String shelf;   //when we use encapsulation we use private variables everytime
    private int bookCount;
    private int notesScribbled;

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public int getNotesScribbled() {
        return notesScribbled;
    }

    public void setNotesScribbled(int notesScribbled) {
        this.notesScribbled = notesScribbled;
    }

    public static void main(String[] args) {
        BookCase bookCase = new BookCase();
        bookCase.setShelf("A");
        bookCase.setBookCount(10);
        bookCase.setNotesScribbled(100);
        System.out.println("Shelf is " + bookCase.getShelf());
        System.out.println("Book Count is " + bookCase.getBookCount());
        System.out.println("Notes Scribbled is " + bookCase.getNotesScribbled());

    }
}

