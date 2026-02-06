class Super{
	void view(){
		System.out.println("This is the Super class...");
	}
}

class Sub extends Super{
	void view(){
		System.out.println("This overrides the super class....");
	}
}

class Override{
	public static void main (String args []){
		Sub sb = new Sub();
		sb.view();
	}
}
