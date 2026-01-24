import java.util.Scanner;
public class Multiple2{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the no.");
		n=sc.nextInt();
		if(n>0){
        int i=1;
		while(i<=100){
					if(i%n==0){
			      System.out.println(i);
					}
		i++;
		}
		}
		else{
			System.out.println("invalid input");
}}}