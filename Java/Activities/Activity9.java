import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        for(String str : myList)
        {
            System.out.println(str);
        }

        System.out.println("Third Value of List "+myList.get(2));
        if(myList.contains("3"))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        System.out.println("Size of List "+myList.size());
        myList.remove("2");
        System.out.println("Size after removing object "+myList.size());

    }
}
