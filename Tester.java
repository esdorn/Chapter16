

/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main()
    {
        LinkedList test = new LinkedList();
        test.addL("test1");
        test.addF("test2");
        test.addF("test3");
        test.addL("test4");
        System.out.println(test);
        ListIterator iter = test.listIterator();
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.previous());
        System.out.println(iter.get());
        iter.add("test5");
        System.out.println(test);
        test.reverse();
        System.out.println(test);
    }
}
