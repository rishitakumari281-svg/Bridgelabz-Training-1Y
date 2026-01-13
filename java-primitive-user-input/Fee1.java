import java.util.Scanner;
public class Fee1{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		double fee;
		System.out.println("enter the fee");
		fee=sc.nextDouble();
		double dis_per=10.0/100.0;
		double amount=dis_per*fee;
		double discount=fee-(amount);
		System.out.println("The discount amount is INR "+amount+" and final discounted fee is INR "+discount);
}}
		