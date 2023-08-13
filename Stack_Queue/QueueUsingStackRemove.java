import java.util.*;

public class QueueUsingStackRemove {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) throws Exception {
        while(!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(item);
        while(!second.isEmpty()) {
            first.push(second.pop());
        }

    }

    public int peek() throws Exception {
        return first.peek();
    }

    public int remove() throws Exception {
        return first.pop();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}