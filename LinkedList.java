import java.util.NoSuchElementException;
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList
{
    private Node first;
    private Node last;
    private int currentSize;
    class Node
    {
        Object data;
        Node next;
    }
    
    class LinkedListIterator implements ListIterator
    {
        private Node node;
        private Node previous;
        private boolean isAfterNext;
        public LinkedListIterator()
        {
            node = null;
            previous = null;
            isAfterNext = false;
        }
        
        public Object next()
        {
            if (!hasNext()){throw new NoSuchElementException();}
            previous = node;
            isAfterNext = true;
            if (node == null)
                node = first;
            else
                node = node.next;
            return node.data;
        }
        
        public boolean hasNext()
        {
            if (node == null)
                return first != null;
            else
                return node.next != null;
        }
        
        public Object previous()
        {
            if(!isAfterNext){throw new NoSuchElementException();}
            Node temp = first;
            node = previous;
            while (temp.next != node)
            {
                temp = temp.next;
            }
            previous = temp;
            isAfterNext=true;
            return node.data;
        }
        
        public Object get()
        {
            return node.data;
        }
        
        public void add(Object element)
        {
            if (node == null)
            {
                addF(element);
                node = first;
            }
            else
            {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = node.next;
                if (newNode.next == null)
                    last = newNode;
                previous = node;
                node.next = newNode;
                currentSize--;
                node = node.next;
            }
        }
        
        public Object remove()
        {
            if(!isAfterNext){throw new NoSuchElementException();}
            Object data = node.data;
            if (last==node)
                last = previous;
            previous.next = node.next;
            node = previous;
            isAfterNext=false;
            currentSize--;
            return data;
        }
    }
    
    /**
     * Default constructor for objects of class LinkedList
     */
    public LinkedList()
    {
        // initialise instance variables
        currentSize = 0;
        first = null;
        last = null;
    }
    
    public void addF(Object data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        if (newNode.next == null)
            last = newNode;
        currentSize++;
        first = newNode;
    }
    
    public void addL(Object data)
    {
        if (first == null)
        {
            addF(data);
        }
        else
        {
            Node newNode = new Node();
            newNode.data = data;
            Node temp = first;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            currentSize++;
            last = newNode;
        }
    }
    
    public Object getF()
    {
        if(first == null){throw new NoSuchElementException();}
        return first.data;
    }
    
    public Object getL()
    {
        if(last == null){throw new NoSuchElementException();}
        return last.data;
    }
    
    private Node getNode(int n)
    {
        Node temp = first;
        for(int i = 0;i<n;i++)
        {
            if (temp.next == null)
                throw new NoSuchElementException();
            temp = temp.next;
        }
        return temp;
    }
    
    public Object get(int n)
    {
        return getNode(n).data;
    }
    
    public void set(int n, Object data)
    {
        getNode(n).data = data;
    }
    
    public boolean contains(Object data)
    {
        Node temp = first;
        while (temp != null)
        {
            if (temp.data.equals(data))
                return true;
            temp = temp.next;
        }
        return false;
    }
    
    public Object removeF()
    {
        if(first == null){throw new NoSuchElementException();}
        Object data = first.data;
        first = first.next;
        currentSize--;
        return data;
    }
    
    public Object removeL()
    {
        if(first == null){throw new NoSuchElementException();}
        Object data = last.data;
        Node temp=first;
        while (temp.next != last)
        {
            temp = temp.next;
        }
        temp.next = last.next;
        last = temp;
        currentSize--;
        return data;
    }
    
    public int size()
    {
        return currentSize;
    }
    
    public void reverse()
    {
        if (currentSize <=1);
        else
        {
            Node p = first;
            Node c = first.next;
            Node t = c.next;
            first.next = null;
            last = p;
            while (c!=null)
            {
                t = c.next;
                c.next = p;
                p = c;
                c = t;
            }
            first = p;
        }
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
    
    public ListIterator listIterator()
    {
        return new LinkedListIterator();
    }
}
