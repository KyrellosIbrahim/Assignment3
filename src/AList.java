public class AList {
    int size; int maxSize;
    Book[] books;
    public AList() {
        size = 0;
        maxSize = 10;
        books = new Book[maxSize];
    }
    public void listAdd(Book p) {
        if(size < maxSize) {
            books[size] = p;
            size++;
        }
        else {
            maxSize *= 2;
            Book[] newBooks = new Book[maxSize];
            for(int i = 0; i < books.length; i++) {
                books[i] = newBooks[i];
            }
            books = newBooks;
        }
    }
    public void listRemove(int pos) {
        for(int i = pos; i < size - 1; i++) {
            books[i] = books[i+1];
        }
        size--;
        books[size] = null;
    }
    public String toString() {
        String result = "";
        for(int i = 0; i < size; i++) {
            result += books[i].toString() + "\n";
        }
        return result;
    }
    public static void main(String[] args) {
        AList booksList = new AList();
        System.out.println(booksList);
        Book book1 = new Book("wireless networks", "anke Berr", 14.99);
        Book book2 = new Book("creme waffles for dummies", "piro lane", 24.79);
        booksList.listAdd(book1);
        booksList.listAdd(book1);
        booksList.listAdd(book2);
        booksList.listAdd(book1);
        System.out.println(booksList);
        booksList.listRemove(1);
        System.out.println(booksList);
    }
}