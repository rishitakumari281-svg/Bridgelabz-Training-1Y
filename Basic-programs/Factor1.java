import java.util.Scanner;
public class Factor1{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the no.");
		n=sc.nextInt();
		if(n>0){
			int f=0;
	for(int i=1;i<n;i++){
					if(n%i==0){
			      f=i;
					}	
		}
		System.out.println(f);
		}
		else{
			System.out.println("invalid input");
}}}