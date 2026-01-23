import java.util.Scanner;
public class Bonus{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int y;
		float n;
System.out.println("enter the years of work");
y=sc.nextInt();
System.out.println("enter the salary ");
n=sc.nextFloat();
if(y>5){
	float bonus=0.05f * n;
	System.out.printf("\n bonus granted= %.2f",bonus);
}
else{
	System.out.println("no bonus granted");
}}}