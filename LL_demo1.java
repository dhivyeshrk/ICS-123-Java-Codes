import java.util.*;
import java.util.concurrent.CountDownLatch;
public class LL_demo1 {
    public static void main(String[] args)
    {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(23);
        l.add(1,24);
        l.addFirst(1);
        System.out.println("Elements of Linked List : " + l);
        Collection array = new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        array.add(4);
        l.addAll(1, array);
        System.out.println("Elements of Linked List after adding an ArrayList: " +l );
        l.peekFirst();
        l.peekLast();
        /*
        add() and addLast() both do the same thing with one parameter. But addLast does not have overloaded method. 
        addLast() is faster
        */ 
        System.out.println("Does the Linked List contain 2 ? " + l.contains(2));
        System.out.println("Does the Linked List contain 0 ? " + l.contains(0));

        /*
         * CLONE - returns an exact copy of the object. Not specific to LinkedList so it has to be type-casted.
         * The JAVA assignment operator only created copies of the reference variable and not the object.
         *  
         * Time Complexity - O(1)
         */
        LinkedList cloned = new LinkedList<Integer>(); //cloned is an object.
        cloned=(LinkedList)l.clone();   
        System.out.println("Contents of cloned LinkedList are : " +  cloned);
        // DESCENDING ITERATOR
        Iterator x = l.descendingIterator();
        System.out.print("Contents of Linked List using reverse iterator are : ");
        while(x.hasNext()) System.out.print(x.next() + " ");



    }
}
