

/**
 * Write a description of interface ListIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ListIterator
{
    /**
     * 
     * @return    description of the return value
     */
    public Object next();
    
    /**
     * 
     */
    public boolean hasNext();
    
    /**
     * 
     */
    public Object previous();
    
    /**
     * 
     */
    public Object get();
    
    /**
     * 
     */
    public void add(Object element);
    
    /**
     * 
     */
    public Object remove();
}
