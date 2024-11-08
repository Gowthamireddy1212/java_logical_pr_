import java.util.Scanner;
class Employee
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int eno;
String ename;
float esalary;
System.out.println("enter the employee number");
eno=sc.nextInt();
System.out.println("enter the employee name");
ename=sc.next();
System.out.println("enter the employee salary");
esalary=sc.nextInt();
System.out.println("the given employee number is:"+eno);
System.out.println("the given employee name is:"+ename);
}
}





