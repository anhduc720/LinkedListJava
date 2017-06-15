import java.util.Random;

/**
 * Created by ducla on 6/16/17.
 */
public class TestClass {
    public static void main(String[] args) {


        //Test create list
        LinkedList linkedList = new LinkedList(0);
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            int number = rd.nextInt() % 100;
            linkedList.add(number);
        }
        //Test print list
        System.out.println("Current list:");
        linkedList.printList();
        System.out.println("***********************");

        //Test append node
        System.out.println("Append number 99:");
        linkedList.add(-99);
        linkedList.printList();
        System.out.println("***********************");

        //Test remove tail node
        System.out.println("Remove Tail:");
        linkedList.removeTail();
        linkedList.printList();
        System.out.println("***********************");

        //Test remove specified node
        System.out.println("Remove number greater than 0:");
        linkedList.removeGreaterThan(0);
        linkedList.printList();
        System.out.println("***********************");

    }
}
