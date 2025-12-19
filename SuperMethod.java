class Parent{
	void show(){
		System.out.println("Method of Super(Parent) class....");
	}
}
class Derive extends Parent{
	String color = "Green";
	void show(){
	System.out.println("Methods of the Sub(Child) class....");
	
	super.show();
	}
}

class SuperMethod{
	public static void main(String args []){
		Derive d = new Derive();
		d.show();
	}
}
