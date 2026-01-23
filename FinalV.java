import java.util.*;
// Final variable will always be initialized in a constructor.....
class A{
	final int a;
	A(){
		a = 100;
	}
	
	void display(){
		for(int i =1; i<5 ; i++){
		System.out.println(a + i);
		}
	}
}

class FinalV{
	public static void main(String args []){
		A b = new A();
		b.display();	
	}
}

