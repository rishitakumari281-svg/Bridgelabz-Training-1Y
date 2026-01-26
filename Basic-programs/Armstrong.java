import java.util.Scanner;
public class Armstrong{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter a no.");
		n=sc.nextInt();
		int c=0;
		int t=n;
		while(t!=0){
			t=t/10;
			c++;
}
 int q=n;
 int s=0;
 while(q!=0){
	 int r=q%10;
	 int p=1;
	 for(int i=1; i<=c ;i++){
		 p=p*r;
	 }
	 s=s+p;
	 q=q/10;
 }
 if(s==n){
	 System.out.println("Armstrong");
 }
 else{
	 System.out.println("not armstrong");
 }
	 
	}}