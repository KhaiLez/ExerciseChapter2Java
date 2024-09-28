public class bai2
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Initial StringBuffer: " + sb);

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        sb.delete(5,6);
        System.out.println("After delete: " + sb);

       sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());

        System.out.println("Length: " + sb.length());

        char ch = sb.charAt(0);
        System.out.println("Character at index: " + ch);

        String sub = sb.substring(0,4);
        System.out.println("Substring (0,4): " + sub);

        int index = sb.indexOf("J");
        System.out.println("Index of 'J': " + index);

        sb.setCharAt(0, 'A');
        System.out.println("After setCharAt: " + sb);

        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
    }
}