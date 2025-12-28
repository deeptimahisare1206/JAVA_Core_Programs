import java.util.*;
interface Lmda{
	int see(int a , int b);
}
class LambdaRt{
	public static void main (String args []){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two elements: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Lmda lm = (a,b)->{
			return (a+b);
		};
		
		System.out.println(lm.see(x,y));
	}
}
