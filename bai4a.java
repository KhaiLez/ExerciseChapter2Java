import java.util.ArrayList;
import java.util.List;
public class bai4a
{
    public static void main(String[] args)
    {
        testArrayListClass();
    }

    private static void testArrayListClass()
    {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("\nArrayList Tests:");

        // Test size()
        System.out.println("Size: " + list.size());

        // Test get()
        System.out.println("Element at index number: " + list.get(1));

        // Test contains()
        System.out.println("Contains 'Banana': " + list.contains("Banana"));

        // Test remove()
        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);

        // Test clear()
        list.clear();
        System.out.println("List after clear: " + list);
    }
}