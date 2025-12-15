import java.util.*;
abstract class Absuper{
	//Abstract method....
	abstract void display();
	//Non-Abstract method...
	void show(){
		System.out.println("Method inside the Super class is called.");
	}
	//Static methods...
	static int cube(int x ){
		return x*x*x;
	}
}

class Absub extends Absuper{
	void display(){
		System.out.println("Super class method overriden");
	}
}

class Abstraction1{
	public static void main(String args []){
		Absub ab = new Absub();
		//Non abstract method calling
		ab.show();
		//Abstract method calling.
		ab.display();
		
		//static method calling
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = sc.nextInt();
		System.out.println("The cube of " + x+ " = " +Absub.cube(x));
		
	}
}
