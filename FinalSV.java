import java.util.*;

// Final static variable will always be initialized in a static block.....
class A{
	
	final static int a;
	
	static{
		a = 100;
	}
	
	void display(){
		for(int i =1; i<5 ; i++){
		System.out.println(a + i);
		}
	}
}

class FinalSV{
	public static void main(String args []){
		A b = new A();
		b.display();
		b.display();
		b.display();
		b.display();
	}
}

