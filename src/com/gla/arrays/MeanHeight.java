import java.util.Scanner;
public class MeanHeight{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[11];
		int i=0;
		int sum=0;
		System.out.println("enter the heights");
		while(i<11){
			int num=sc.nextInt();
			arr[i]=num;
			sum=sum+arr[i];
			i++;
		}
		System.out.println("average height= "+(sum/11));
		
}}