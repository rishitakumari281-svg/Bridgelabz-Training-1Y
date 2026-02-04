import java.util.Scanner;
public class FactorArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=1;
		int j=0;
		while(i<=n){ 
			if(n%i==0){
				a[j]=i;
				j++;
			}
			i++;
		}
		System.out.println("the factors are=");
		for( int k=0; k<j;k++){
			System.out.println(a[k]);
		}
}}
				
		