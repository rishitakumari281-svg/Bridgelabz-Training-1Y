import java.util.Scanner;
public class Divisible{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
     int number;
System.out.println(" enter the number");
number=sc.nextInt();
if(number%5==0){
System.out.println("Is the number "+number+" divisible by 5? YES");
}
else{
	System.out.println("Is the number "+number+" divisible by 5? NO");
}}}