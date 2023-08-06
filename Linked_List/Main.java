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
        list.delete(1);
        System.out.println(list.find(8));
        list.display();
    }
}