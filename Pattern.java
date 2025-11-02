import java.util.*;
class Pattern{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		//upper triangle
		
		for(int i=1; i<=n; i++){
			for(int j=n; j>i; j--){
				System.out.print("*");
			} 
			for(int k=1; k<=(2*i-1); k++){
				System.out.print(".");
			} 
			for(int p=n; p>i; p--){
				System.out.print("*");
			}
			System.out.println();
		}
		//Lowertriangle
		for(int i=n; i>=1; i--){
			for(int j=n; j>i; j--){
				System.out.print("*");
			} 
			for(int k=1; k<=(2*i-1); k++){
				System.out.print(".");
			} 
			for(int p=n; p>i; p--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
