import java.util.Scanner;
class Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sno;
String sname;
String sclass;
System.out.println("enter the student number");
sno=sc.nextInt();
System.out.println("enter the student name");
sname=sc.next();
System.out.println("enter the employee salary");
sclass=sc.next();
System.out.println("the given student number is:"+sno);
System.out.println("the given student name is:"+sname);
System.out.println("the given student class is:"+sclass);
}
}