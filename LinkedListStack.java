import java.util.NoSuchElementException;

/**
   An implementation of a stack as a sequence of nodes.
*/
public class LinkedListStack
{
   private Node first;

   /**
      Constructs an empty stack.
   */
   public LinkedListStack()
   {
      first = null;
   }

   /**
      Adds an element to the top of the stack.
      @param element the element to add
   */
   public void push(Object data)
   {
       Node temp = new Node();
       temp.data = data;
       temp.next = first;
       first = temp;
   }

   /**
      Removes the element from the top of the stack.
      @return the removed element
   */
   public Object pop()
   {
       if (first == null){throw new NoSuchElementException();}
       Node temp = first;
       first = temp.next;
       return temp.data;
   }
   
   public boolean contains(Object data)
   {
       Node temp = first;
       while (temp != null)
       {
            if (data.equals(temp.data))
                return true;
            temp = temp.next;
       }
       return false;
   }
   
   public String toString()
   {
       Node temp = first;
       String s = "{";
       while (temp!=null)
       {
           s+=temp.data+", ";
           temp = temp.next;
       }
       return s.substring(0,s.length()-2)+"}";
   }

   /**
      Checks whether this stack is empty.
      @return true if the stack is empty
   */
   public boolean isEmpty()
   {
       return first == null;
   }



   class Node
   {
      public Object data;
      public Node next;
   }
}
