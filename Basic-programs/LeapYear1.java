import java.util.Scanner;
public class LeapYear1{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the year");
		n=sc.nextInt();
		int f=0;
		if (n>=1582){
			if((n%400==0)||(n%4==0&&n%100!=0)){
				f=1;
			}
			else{
				f=0;
			}
		}
		else{
			System.out.println("invalid input");
		}
		if(f==1){
		System.out.println("leap year");}
		else{
			System.out.println("not a leap year");
		}
	}
}
		