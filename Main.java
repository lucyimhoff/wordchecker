import java.util.ArrayList;

public class Main{
 
 public static void main(String[] args)
{
    ArrayList<String> words = new ArrayList<String>();
    words.add("an");
    words.add("band");
    words.add("band");
    words.add("abandon");
    System.out.print(words);
    WordChecker x = new WordChecker(words);
    System.out.println(x.isWordChain());
    ArrayList<String> testTwo = new ArrayList<String>();
    testTwo.add("to");
    testTwo.add("too");
    testTwo.add("stool");
    testTwo.add("tools");
    WordChecker y = new WordChecker(testTwo);
    System.out.println(testTwo);
    System.out.println(y.isWordChain());
}
}


