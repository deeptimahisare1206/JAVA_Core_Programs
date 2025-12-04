import java.util.*;

class Array1{
public static void main(String args [] ){
int a[]= new int [10];
int n,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the array size: ");
n=sc.nextInt();
System.out.println("Enter the elements of array: ");
for(i = 1; i<=n;i++){
a[i]=sc.nextInt();

}
System.out.println("Array: ");
for(i=1;i<=n;i++){
System.out.println(a[i]);
}

}
}
