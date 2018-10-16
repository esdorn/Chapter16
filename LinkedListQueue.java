import java.util.NoSuchElementException;
/**
   Add a method firstToLast to this implementation of a queue.
   The method moves the element at the head of the queue to
   the tail of the queue. The element that was second in line
   will now be at the head.
*/
public class LinkedListQueue
{
    private Node head;
    private Node tail;
    
    /**
      Constructs an empty queue.
    */
    public LinkedListQueue()
    {
        head = null;
        tail = null;
    }
    
    /**
      Moves the head of the queue to the tail.
    */
    public void firstToLast()
    {
        tail.next = head;
        tail = head;
        head = tail.next;
        tail.next = null;
    }
    
    public void lastToFirst()
    {
        Node temp = head;
        while (temp.next != tail)
        {
            temp = temp.next;
        }
        temp.next = tail.next;
        tail.next = head;
        head = tail;
        tail = temp;
    }
    
    /**
      Checks whether this queue is empty.
      @return true if this queue is empty
    */
    public boolean empty()
    {
        return head == null;
    }
    
    /**
      Adds an element to the tail of this queue.
      @param newElement the element to add
    */
    public void add(Object newElement)
    {
        Node temp = new Node();
        temp.data = newElement;
        if (empty())
            head = temp;
        else
            tail.next = temp;
        tail = temp;
    }
    
    /**
      Removes an element from the head of this queue.
      @return the removed element
    */
    public Object remove()
    {
        if (empty())
            throw new NoSuchElementException();
        Node temp = head;
        head = temp.next;
        if (head == null)
            tail = null;
        return temp.data;
    }

    class Node
    {
        public Object data;
        public Node next;
    }
}
