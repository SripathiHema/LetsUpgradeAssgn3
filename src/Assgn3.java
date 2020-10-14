
import java.util.Scanner;

public class Assgn3
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
            System.out.println("enter 5 integer values");
            int arr[]=new int[5];
            for(int i=0;i<5;i++)
            {
            arr[i]=sc.nextInt();
            }
            int sum=0;
            for(int i=0;i<5;i++)
            {
                sum=sum+arr[i];
            }
    System.out.println(sum);
    }
}
