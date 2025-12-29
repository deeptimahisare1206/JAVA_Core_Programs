import java.util.*;

class MatrixAdd{
	public static void main(String args[]){
		
		int i, j , m,n;
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		int c[][] = new int[30][30];
		System.out.println("Enter the number of rows: ");
		m = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		n = sc.nextInt();
		
		System.out.println("Enter the matrix 1: ");
		for(i = 0 ; i<m ; i++){
			for(j = 0 ; j < n ; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Enter the matrix 2: ");
		for(i = 0 ; i<m ; i++){
			for(j = 0 ; j < n ; j++){
				b[i][j] = sc.nextInt();
			}
		}
		
		
		for(i = 0 ; i<m ; i++){
			for(j = 0 ; j < n ; j++){
				c[i][j] = a[i][j] + b[i][j] ;
			}
		}
		
		System.out.println("Addition of two given matrix are as below: ");
		for(i = 0 ; i<m ; i++){
			for(j = 0 ; j < n ; j++){
				
				System.out.print(c[i][j] + "  ");
				
			}
			
		System.out.println(" ");
		}
	}
}
