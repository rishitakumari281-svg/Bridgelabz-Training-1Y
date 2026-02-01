import java.util.Scanner;
public class Mul{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n=sc.nextInt();
		for(int i=6;i<=9;i++){
			int mul=n*i;
			System.out.println(n+"*"+i+"="+mul);
}}}