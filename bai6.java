import java.util.Scanner;
import java.lang.String;
public class bai6
{
    public static void main(String[] args)
    {
        Scanner keyboard= new Scanner(System.in);
        double benefit, income, cost;
        String name, address;

        System.out.print("Enter the name: ");
        name= keyboard.nextLine();
        System.out.print("Enter the address: ");
        address= keyboard.nextLine();

        System.out.print("Enter the income: ");
        income=keyboard.nextDouble();
        System.out.print("Enter the cost: ");
        cost=keyboard.nextDouble();
        benefit=income-cost;

        System.out.println("The information of Company: ");
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
        System.out.println("Income: "+ income);
        System.out.println("Cost: "+ cost);
        System.out.println("Profit: "+ benefit);
        if(income>cost)
        {
            System.out.print("The benefit is: "+ benefit+ "\n");
        }
        else
        {
            if (income == cost)
            {
                System.out.print("Uneconomic\n");
            }
            else
            {
                System.out.print("Business losses\n");
            }
        }
    }
}
