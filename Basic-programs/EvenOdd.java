import java.util.Scanner;
public class EvenOdd{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=sc.nextInt();
		int arr[]= new int[n];
		int ar[]=new int[n];
		int e=0,f=0;
		for(int i=1; i<=n; i++){
			if(i%2==0){
			arr[e]=i;
			e++;}
			else{
			ar[f]=i;
			f++;
			}
		}
		System.out.println("even");
		for(int i=0; i<e ; i++){
		System.out.println( arr[i]);}
		System.out.println("odd");
		for(int i=0; i<f ; i++){
		System.out.println( ar[i]);}
}}