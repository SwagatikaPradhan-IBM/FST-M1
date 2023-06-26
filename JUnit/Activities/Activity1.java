import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    static List<String> list;
    @BeforeAll
    public static void setUp()
    {
        list = new ArrayList<>();
        list.add("alpha");
        list.add("beta");
    }
    @Test
    public void insertTest()
    {
        assertEquals(2, list.size(), "Wrong size");
        list.add(2, "gamma");
        System.out.println(list);
        assertEquals(3, list.size(), "Wrong size");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("gamma", list.get(2), "Wrong element");
    }
    @Test
    public void replaceTest()
    {
        assertEquals(2, list.size(), "Wrong size");
        list.add(2,"yamma");
        assertEquals(3, list.size(), "Wrong size");
        list.set(1, "gamma");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("gamma", list.get(1), "Wrong element");
        assertEquals("yamma", list.get(2), "Wrong element");
        list.clear();
        list.add("alpha");
        list.add("beta");
    }

}
