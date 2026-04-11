import java.util.*;

class Employee{

int empno, salary;
String empname;
int da ,hra , pf, total;

void calculate(){

da =(salary *30)/100;
hra =(salary *45)/100;
pf=(salary *10)/100;
total = salary +da+hra-pf;
}

void getdata(  String ch,int a, int b){
empname = ch;
empno = a;
salary = b;


}
void display(){
calculate();
System.out.println("Employee number: " + empno);
System.out.println("Employee salary: " + salary);
System.out.println("Employee name: " + empname);
System.out.println("------_------------_-----");
System.out.println("DA: " + da);
System.out.println("HRA: " + hra);
System.out.println("PF: - " + pf);
System.out.println("Total: " + total);

}

}

class Empmain{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
Employee em = new Employee();


String name;
int eid;
int sa;
System.out.println("Enter the employee name: ");
name = sc.nextLine();
System.out.println("Enter the employee number: ");
eid = sc.nextInt();

System.out.println("Enter the employee salary: ");
sa = sc.nextInt();

//System.out.println("Enter the employee name: ");
//name = sc.nextLine();
em.getdata(name,eid,sa);
em.display();

}

}
