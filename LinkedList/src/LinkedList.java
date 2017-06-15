/**
 * Created by ducla on 6/15/17.
 */
public class LinkedList {

    private LinkNode first;
    private LinkNode last;
    private int N;

    /**
     * @param item initialize value
     */
    public LinkedList(int item) {
        first = null;
        last = null;
        N = 0;
    }

    /**
     * @param item value to add
     */
    public void add(int item) {
        if (!isEmpty()) {
            LinkNode prev = last;
            last = new LinkNode(item);
            prev.next = last;
        } else {
            last = new LinkNode(item);
            first = last;
        }
        N++;
    }

    /**
     * remove tail node
     */
    public void removeTail() {
        if (!isEmpty()) {
            if (first == last) {
                first = null;
                last = null;
                N = 0;
            } else {
                LinkNode prev = first;
                while (prev.next.next != null) {
                    prev = prev.next;
                }
                prev.next = null;
                N--;
            }

        } else {
            throw new NullPointerException("This list is null.");
        }
    }

    /**
     * @param value remove nodes that greater than
     */
    public void removeGreaterThan(int value) {
        if (!isEmpty()) {
            LinkNode prev = first;
            while (prev.next != null) {
                if (prev.next.data > value) {
                    prev.next = prev.next.next;
                } else {
                    prev = prev.next;
                }
            }
            last = prev;
            if (first.data > value) {
                first = first.next;
            }
            if (last.data > value) {
                removeTail();
            }

        } else {
            throw new NullPointerException("This list is null.");
        }
    }

    /**
     * @return check list is empty
     */
    private boolean isEmpty() {
        return N == 0;
    }

    /**
     * print list to console
     */
    public void printList() {
        LinkNode node = first;
        while (node != null) {
            System.out.print(node.data);
            System.out.print(" ");
            node = node.next;
        }
        System.out.println();
    }
}
