class MemberOuter{
	int a =120;
	class MemberInner{
		void display(){
			System.out.println(a);
		}
	}
}

class Membermain{
	public static void main(String args []){
		MemberOuter Mo = new MemberOuter();
		MemberOuter.MemberInner MOmin = Mo.new MemberInner();
		MOmin.display();
	}
}