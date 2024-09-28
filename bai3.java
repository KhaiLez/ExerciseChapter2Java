import java.util.Random;
public class bai3
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int intValue = random.nextInt();
        System.out.println("Random int: " + intValue);

        int boundedIntValue = random.nextInt(100);
        System.out.println("Random int between 0 and 99: " + boundedIntValue);

        double doubleValue = random.nextDouble(100);
        System.out.println("Random double: " + doubleValue);

        float floatValue = random.nextFloat();
        System.out.println("Random float: " + floatValue);

        long longValue = random.nextLong();
        System.out.println("Random long: " + longValue);

        boolean booleanValue = random.nextBoolean();
        System.out.println("Random boolean: " + booleanValue);

        double gaussianValue = random.nextGaussian();
        System.out.println("Random Gaussian value: " + gaussianValue);

        byte[] ByteNumber = new byte[10];
        random.nextBytes(ByteNumber);
        System.out.print("Random bytes: ");
        for (int b : ByteNumber)
        {
            System.out.print(b + " ");
        }
        System.out.println();

        try
        {
            int NegativeBounded = random.nextInt(-10);
        } catch (IllegalArgumentException e)
        {
            System.out.println("Check the negative value: " + e.getMessage());
        }

        random.setSeed(0);
        int seededIntValue = random.nextInt();
        System.out.println("Random int after setting seed: " + seededIntValue);
    }
}