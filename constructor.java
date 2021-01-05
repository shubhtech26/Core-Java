import java.util.Scanner;

public class constructor
{
String name;
int age;
String address;

public constructor() {
name = "unknown";
age = 0;
address ="not available";
}

public void setInfo(String name, int age)
{
this.name = name;
this.age = age;
}

public void setInfo(String name, int age,String address)
{
this.name = name;
this.age = age;
this.address = address;
}

public static void main(String[] args)
{
String name;
int age;
String address;
constructor[] students= new constructor[10];
Scanner scanner1 = new Scanner(System.in);
Scanner scanner2 = new Scanner(System.in);
for (int i = 0; i < students.length; i++)
{
students[i] = new constructor();

System.out.println("name=");
name=scanner1.nextLine();
System.out.println("age=");
age=scanner2.nextInt();
System.out.println("address=");
address=scanner1.nextLine();

students[i].setInfo(name, age, address);
}
}
} 


