
/**
   This program demonstrates the LinkedList class.
*/
public class LinkedListWork
{
   public static void main(String[] args)
   {
       LinkedList words = new LinkedList();
       words.addL("Aggressive");
       words.addL("Brown");
       words.addL("Cool");
       words.addL("Dusty");
       words.addF("Sane");
       words.addF("Purple");
       words.addF("Few");
       words.addF("Dull");
       words.addL("Salty");
       words.addL("Modern");
       words.addF("Whispering");
       words.addF("Tart");
      
      // Print all elements

      System.out.println(words);
      System.out.println("Expected: [?,?,?,?]");
   }
}
