import java.util.*;
class Greatest4 {
public static void main(String args[]){

int a,b,c,d;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the FOUR numbers: ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();

if(a>b && a>c && a>d)
System.out.println("A is greatest");

if(b>a && b>c && b>d)
System.out.println("B is greatest");

if(c>a && c>b && c>d)
System.out.println("C is greatest");

if(d>a && d>b && d>c)
System.out.println("D is greatest");

}
}
