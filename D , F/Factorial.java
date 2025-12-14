import java.util.*;
class Factorial {
public static void main(String args[]){

int num, fact= 1,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
num=sc.nextInt();
 for(i=num; i>=1;i--){
fact*=i;
}
System.out.println("Factorial of the number " +num +" is: " + fact);

}
}
