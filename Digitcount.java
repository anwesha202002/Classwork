import java.util.Scanner;
public class Digitcount
{
public static void main(String[] args)
{
int num,c=0;
System.out.println("Enter the number: ");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num!=0)
{
num=num/10;
c++;
}
System.out.println("Number of digits: "+c);
}
}