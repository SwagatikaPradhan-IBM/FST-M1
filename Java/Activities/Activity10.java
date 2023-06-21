import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add("4");
        hs.add("5");
        hs.add("6");
        System.out.println("Size of hashmap "+hs.size());
        hs.remove("3");
        if(hs.remove("7"))
        {
            System.out.println("7 is removed from set");
        }
        else
        {
            System.out.println("7 is not removed from set");
        }
        if(hs.contains("4"))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        for(String str : hs)
        {
            System.out.println(str);
        }
    }
}
