import java.util.*;

class Largearray{
public static void main(String args []){
int a[] = new int[25];
Scanner sc  = new Scanner(System.in);
int n,i;
int large = a[0];

System.out.println("Enter the array size: ");
n=sc.nextInt();

System.out.println("Enter the array numbers:");
for(i=1; i<=n; i++){
a[i] = sc.nextInt();
}

for (i= 1; i<=n; i++){
if (large <a[i]){
large = a[i];
}

}
System.out.println("Largest element in the array: " + large);

}

}
