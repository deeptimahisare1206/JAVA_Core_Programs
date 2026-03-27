import java.util.*;

class Student{
	int rollno;
	String sname, iname, course;
	
	Scanner sc = new Scanner(System.in);
	Student(){
		iname = "Universal informatics";
		course = "Java";
	}
	
	void getdata(){
		System.out.println("Enter the Students name: ");
		sname = sc.nextLine();
		
		System.out.println("Enter the rollno: ");
		rollno = sc.nextInt();
		
		
	}
	
	void display(){
		
		System.out.println("Students rollno: " + rollno);
		System.out.println("Students name: " + sname);
		System.out.println("Institute name : " + iname);
		System.out.println("Course: " + course);
		
		
	}
	
}

class Constructor{
	public static void main(String args[]){
		
		Student st[] = new Student[10];
		int x;
		System.out.println("Enter the no. of Students: ");
		x = sc.nextInt();
		st.getdata();
		st.display();
	}
}
