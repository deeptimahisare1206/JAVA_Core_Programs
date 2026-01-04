import java.util.*;
interface Inter{
	void calculate();
}
interface Two{
	void calculate();
}
class Company implements Inter,Two{
	int empno,salary,da,hra,pf,total;
	void getdata(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Employee number");
		empno = sc.nextInt();
		System.out.println("Enter the Employee Salary");
		salary = sc.nextInt();
	}
	public void calculate(){
	da = (salary*130)/100;
	hra = (salary*45)/100;	
	pf = (salary*15)/100;
	total = salary+da +hra+pf;
	}
	void show(){
		System.out.println("Employee number: "+ empno);
		System.out.println("Employee Salary: "+ salary);
		System.out.println("DA: "+ da);
		System.out.println("HRA: "+ hra);
		System.out.println("PF: -"+ pf);
		System.out.println("-----xxxxxxxxxxxxxxxxxxxxxxx---------------------------------- ");
		System.out.println("Total Salary: "+ total);
	}
}
class Multiple{
	public static void main(String args[]){
		Company cy = new Company();
		cy.getdata();
		cy.calculate();
		cy.show();
	}
}
