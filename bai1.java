public class bai1
{
    public static void main(String[] args)
    {
        char[] Kytu={'A', 'a', '1', ' ', '@', '9', 'Z', 'z', '\n', 'B'};

        for (char kytu: Kytu)
        {
            System.out.println("Character: "+kytu);
            System.out.println("Digit: "+ Character.isDigit(kytu));
            System.out.println("Letter: "+ Character.isLetter(kytu));
            System.out.println("Whitespace: "+ Character.isWhitespace(kytu));
            System.out.println("toUpperCase: "+ Character.toUpperCase(kytu));
            System.out.println("toLowerCase: "+ Character.toLowerCase(kytu));
            System.out.println("isUpperCase: "+ Character.isUpperCase(kytu));
            System.out.println("isLowerCase: "+ Character.isLowerCase(kytu));
            System.out.println("toString: "+ Character.toString(kytu));
            System.out.println("CharValue: "+ new Character(kytu).charValue());
            System.out.println("getType: "+ Character.getType(kytu));
            System.out.println("Alphabetic: "+ Character.isAlphabetic(kytu));
            System.out.println("\n");
        }
    }
}