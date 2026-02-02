import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n=sc.nextInt();
		for(int i=1;i<=10;i++){
			int mul=n*i;
			System.out.println(n+"*"+i+"="+mul);
}}}