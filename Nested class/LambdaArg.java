interface Lemda{
	void view(String str);
}
class LambdaArg{
	public static void main(String args []){
		Lemda le = (str)->{
			System.out.println("Welcome, Good Morning" + str);
		};
		le.view("Deep");
	}
}
