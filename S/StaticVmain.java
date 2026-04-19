class StaticV{
	
	static int count = 0;
	
	StaticV(){
		count++;
		System.out.println( " --> " + count);
	}
}

class StaticVmain{
	public static void main(String args []){
		StaticV sv = new StaticV();
		StaticV sv1 = new StaticV();
		StaticV sv2 = new StaticV();
	}
}
