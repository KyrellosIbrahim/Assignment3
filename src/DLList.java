public class DLList {
    DLNode head;
    int size = 0;
    public DLList() {
        head = null;
    }
    public void listAdd(Book p) {
        if(head == null) {
            head = new DLNode(p);
        }
        else {
            DLNode current = head;
            while(current.next != null) {
                current = current.next;
            }
            DLNode newNode = new DLNode(p);
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
    }

    public void listRemove(int pos) {
        if(pos < 0 || pos >= size || head == null) {return;} //handle bad pos input
        if(pos == 0) { //remove first element
            head=head.next;
            if(head != null) {
                head.prev = null;
            }
            size--;
            return;
        }

        DLNode current = head;
        for(int i = 0; i < pos; i++) {
            current = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }

        size--;
    }

    public String toString() {
        DLNode current = head;
        String result = "";
        while(current != null) {
            result += current.data.toString() + "\n";
            current = current.next;
        }
        return result;
    }
    public static void main(String[] args) {
        DLList booksList = new DLList();
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
