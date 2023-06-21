import javax.print.attribute.IntegerSyntax;
import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> colours = new HashMap<>();
        colours.put(1,"Violet");
        colours.put(2,"Indigo");
        colours.put(3,"Blue");
        colours.put(4, "Green");
        colours.put(5, "Yellow");
        System.out.println("Map is "+colours);
        System.out.println("Blue is removed "+colours.remove(3));
        System.out.println("Map after removing "+colours);
        if(colours.containsValue("Green"))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        System.out.println("Size of map "+colours.size());
    }
}
