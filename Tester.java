

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
        /*
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
        /*
        LinkedListStack test1 = new LinkedListStack();
        test1.push("test1");
        test1.push("test2");
        test1.push("test3");
        System.out.println(test1);
        while (!test1.isEmpty())
        {
            System.out.println(test1.pop());
        }
        /**/
        LinkedListQueue test2 = new LinkedListQueue();
        test2.add("test1");
        test2.add("test2");
        test2.add("test3");
        test2.add("test4");
        test2.firstToLast();
        System.out.println(test2.remove());
        System.out.println(test2.remove());
        System.out.println(test2.remove());
        System.out.println(test2.remove());
        /**/
    }
}
