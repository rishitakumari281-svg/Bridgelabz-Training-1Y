import java.util.Scanner;
public class UntilZero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int i=0;
		int sum=0;
		while(i<10){
			int num=sc.nextInt();
			if(num<=0){
			break;}
			arr[i]=num;
			System.out.println("entered no = "+arr[i]);
			sum=sum+arr[i];
			i++;
		}
		System.out.println("sum of numbers = "+sum);
		
}}