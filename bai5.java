import java.util.*;
import java.lang.String;
public class bai5
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String ten, tuoi, diachi;
        System.out.print("Enter the student's name: ");
        ten= keyboard.nextLine();
        System.out.print("Enter the student's age: ");
        tuoi= keyboard.nextLine();
        System.out.print("Enter the student's address: ");
        diachi= keyboard.nextLine();

        int i, n;
        System.out.print("Enter the number of subjects: ");
        n = keyboard.nextInt();
        int sum;
        int[] marks = new int[n];
        double average;
        sum=0;
        for ( i = 0; i <n; i++)
        {
            System.out.print("Enter mark for subject: " + (i + 1) + ": ");
            marks[i] = keyboard.nextInt();
            sum=sum+marks[i];
        }
        average=sum/n;
        System.out.println("Student Information:");
        System.out.println("Name: "+ ten);
        System.out.println("Age: "+ tuoi);
        System.out.println("Address: "+ diachi);
        System.out.print("Marks: ");
        for (int diem: marks)
        {
            System.out.print(diem + " ");
        }
        System.out.print("\n");
        System.out.println("Average of all subjects: "+ average);
    }
}
