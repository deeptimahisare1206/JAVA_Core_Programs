class StringOdd{
	public static void main(String args []){
		String name = ("Ramshankar");
		int n = name.length();
		for(int i = 0; i<n; i++){
			if(i%2!=0){
				System.out.print(name.charAt(i)+" " );
			}
		}
	}
}
