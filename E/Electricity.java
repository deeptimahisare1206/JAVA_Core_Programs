import java.util.*;
class Electricity {
public static void main(String args[]){
String name;
int  id,prev,curt,unit;
float amount;
Scanner sc=new Scanner (System.in);

System.out.println("Enter consumer name: ");
name=sc.nextLine();

System.out.println("Enter consumer id: ");
id=sc.nextInt();

System.out.println("Enter previous reading: ");
prev=sc.nextInt();

System.out.println("Enter current reading: ");
curt=sc.nextInt();



unit=curt- prev;

if(unit<50)
amount=unit*3.25f;
else if (unit>=50 && unit<100)
amount=unit*5f;
else if(unit>=100 && unit<=200)
amount= unit*6.75f;
else
amount = unit*8f;

System.out.println("Consumer name: " + name);

System.out.println("Consumer id: " + id);

System.out.println(" Previous Reading: " + prev);

System.out.println(" Current Reading: " + curt);

System.out.println("Unit used: " + unit);

System.out.println("Total Amount: " + amount);



}
}
