import java.util.*;

class Fabonacci{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int a=-1;
int b=1;
int i, n,sum=0;
System.out.println("Enter the range: ");
n=sc.nextInt();

for(i=0; i<=n;i++){
sum = a+b;
a=b;
b=sum;
System.out.println(sum);
}

}

}
