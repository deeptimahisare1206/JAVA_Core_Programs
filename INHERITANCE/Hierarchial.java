//Hierarchical inheritance 
import java.util.*;

class P{
	int x,y;
	Scanner sc = new Scanner(System.in);
	
	void getdata(){
		
		System.out.println("Enter the two values: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
	}
}

class Q extends P{
	int sum;
	
	void cal_Add(){
		sum = x + y;
		
		System.out.println(x + "+" + y + "=" + sum);
	}
}

class R extends P{
	int sub;
	void cal_Sub(){
		sub = x - y;
		
		System.out.println(x);
		System.out.println(x + "-" + y + "=" + sub);
	}
}

class Hierarchial{
	public static void main(String args []){
		
		Q q = new Q();
		R r = new R();
		q.getdata();
		q.cal_Add();
		r.getdata();
		r.cal_Sub();
		
	}
}
