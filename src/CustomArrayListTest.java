import org.junit.Test;
import static org.junit.Assert.*;

public class CustomArrayListTest {

    @Test
    public void testAddAndGet() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        assertEquals("one", list.get(0));
        assertEquals("two", list.get(1));
        assertEquals("three", list.get(2));
    }

    @Test
    public void testGetSize() {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        assertEquals(0, list.getSize());
        list.add(1);
        assertEquals(1, list.getSize());
        list.add(2);
        assertEquals(2, list.getSize());
        list.add(3);
        assertEquals(3, list.getSize());
    }

    @Test
    public void testRemove() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        assertEquals("two", list.remove(1));
        assertEquals(2, list.getSize());
        assertEquals("one", list.get(0));
        assertEquals("three", list.get(1));
    }
}