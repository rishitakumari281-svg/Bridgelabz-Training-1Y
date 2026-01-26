import java.util.Scanner;
public class Harshad{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter a no.");
		n=sc.nextInt();
 int q=n;
 int s=0;
 while(q!=0){
	 int r=q%10;
	 s=s+r;
	 q=q/10;
 }
 if(n%s==0){
	 System.out.println("Harshad");
 }
 else{
	 System.out.println("not harshad");
 }
	 
}}