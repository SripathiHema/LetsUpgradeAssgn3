import java.util.Scanner;
class avenger
{
String name;
int age;
int power;
String weapon;
String planet;
public void getDetails()
{
    Scanner sc=new Scanner(System.in);
System.out.println("enter name,age,power,weapon and planet of avenger");
name=sc.nextLine();
age=sc.nextInt();
power=sc.nextInt();
weapon=sc.next();
planet=sc.next();
}
public void displayDetails()
{
System.out.println("Avenger Name is "+name+"\tAge= "+age+"\tPower= "+power+"\tWeapon is "+weapon+"\tPlanet= "+planet);
}
}

