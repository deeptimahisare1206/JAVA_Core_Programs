import java.util.*;
class Area{
public static void main(String args[]){
int radius;
float area;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Radius: ");
radius = sc.nextInt();

area = 3.14f*radius*radius;
System.out.println("The Area of circle is : "+area);

}
}
