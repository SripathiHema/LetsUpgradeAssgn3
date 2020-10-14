import java.util.Scanner;
public class Assgn2 {
    public static void main(String args[])
            {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter 5 integer values");
            int arr[]=new int[5];
            for(int i=0;i<5;i++)
            {
            arr[i]=sc.nextInt();
            }
            for(int i=0;i<5;i++)
            {
            if(arr[i]%2!=0)
            {
            System.out.println(arr[i]);
            }
            }
            }

}
