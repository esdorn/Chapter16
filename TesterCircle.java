

/**
 * Write a description of class TesterCircle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesterCircle
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main()
    {
        CircularArrayQueue test = new CircularArrayQueue();
        test.add("test1");
        test.add("test2");
        test.add("test3");
        test.add("test4");
        test.add("test5");
        test.add("test6");
        System.out.println(test.remove());
        System.out.println(test);
        test.add("test7");
        test.add("test8");
        //test.add("test9");
        //test.add("test10");
        //test.add("test11");
        System.out.println(test);
        test.lastToFirst();
        test.lastToFirst();
        test.lastToFirst();
        System.out.println(test);
        test.firstToLast();
        System.out.println(test);
    }

}
