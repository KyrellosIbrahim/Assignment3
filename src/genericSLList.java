public class genericSLList<T> {
    int size = 0;
    SLNode head;
    public genericSLList() {
        this.head = null;
    }

    public void listAdd(T p) {
        SLNode nextNode = new SLNode(p);
        if(head == null) {
            head = new SLNode(p);
        }
        else {
            SLNode current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = nextNode;
        }
        size++;
    }

    public void listRemove(int pos) {
        if(pos < 0 || pos >= size || head == null) {return;} //handle bad pos input
        if(pos == 0) { //remove first element
            head=head.next;
            size--;
            return;
        }

        SLNode current = head;
        SLNode previous = null;
        for(int i = 0; i < pos; i++) {
            previous = current;
            current = current.next;
            if(current == null) {return;}
        }
        if(previous != null) {
            previous.next = current.next;
        }
    }

    public String toString() {
        SLNode current = head;
        String result = "";
        while(current != null) {
            result += current.data.toString() + "\n";
            current = current.next;
        }
        return result;
    }
    public static void main(String[] args) {
        genericSLList booksList = new genericSLList();
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
