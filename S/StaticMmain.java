import java.util.*;

class StaticM{
	int rollno;
	String sname;
	static String iname = "Universal";
	Scanner sc = new Scanner(System.in);
		
	
	
	void getvalue(){
		
		System.out.println("Enter the student's name.: ");
		sname = sc.nextLine();
		
		System.out.println("Enter the roll no.: ");
		rollno = sc.nextInt();
	}
	
	void display(){
		
		System.out.println("Students roll NO.: " + rollno);
		System.out.println("Student name: " + sname);
		System.out.println("Institute: "+ iname);
	}
	
	static void change(){
		
		iname = "Informatics";
	}
}

class StaticMmain{
	public static void main(String args []){
		
		StaticM sm = new StaticM();
		sm.getvalue();
		sm.display();
		StaticM.change();
		sm.display();
		sm.iname = "Infobeans";
		sm.display();
		
	}
}
