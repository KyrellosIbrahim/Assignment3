public class genericAList<T> {
    int size; int maxSize;
    Object[] a;
    public genericAList() {
        size = 0;
        maxSize = 10;
        a = new Object[maxSize];
    }
    public void listAdd(T p) {
        if(size < maxSize) {
            a[size] = p;
            size++;
        }
        else {
            maxSize *= 2;
            Object[] newArr = new Object[maxSize];
            for(int i = 0; i < a.length; i++) {
                a[i] = newArr[i];
            }
            a = newArr;
        }
    }
    public void listRemove(int pos) {
        for(int i = pos; i < size - 1; i++) {
            a[i] = a[i+1];
        }
        size--;
        a[size] = null;
    }
    public String toString() {
        String result = "";
        for(int i = 0; i < size; i++) {
            result += a[i].toString() + "\n";
        }
        return result;
    }
    public static void main(String[] args) {
        genericAList booksList = new genericAList();
        System.out.println(booksList);
        Book book1 = new Book("wireless networks", "Anke Berr", 14.99);
        Book book2 = new Book("creme waffles for dummies", "Piro lane", 24.79);
        booksList.listAdd(book1);
        booksList.listAdd(book1);
        booksList.listAdd(book2);
        booksList.listAdd(book1);
        System.out.println(booksList);
        booksList.listRemove(1);
        System.out.println(booksList);
    }
}