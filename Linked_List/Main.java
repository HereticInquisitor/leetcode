public class Main {
    public static void main(String args[]) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.inserLast(99);
        list.insert(100,2);
        list.deleteFirst();
        list.deleteLast();
        list.display();
    }
}