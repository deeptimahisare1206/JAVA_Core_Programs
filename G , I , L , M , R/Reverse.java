import java.util.*;

class Reverse{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int n,i, sum = 0,a;
System.out.println("Enter the number: ");
n = sc.nextInt();

while(n!=0){
a= n%10;
n=n/10;
sum = sum *10+a;

}
System.out.println("The Number after reversing is: ");
System.out.println(sum);

}
}
