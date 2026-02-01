import java.util.Scanner;
public class EvenOddArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of numbers");
		int n=sc.nextInt();
		int e=n/2;
		int o=n-e;
		int even[] = new int[e];
		int odd[] = new int[o];
		int i=1;
		int j=0;
		int l=0;
		while(i<=n){
			if(i%2==0){
			even[j]=i;
			j++;
			}
			else{
			odd[l]=i;
			l++;
			}
			i++;
		}
		int k=0;
			System.out.println("even numbers = ");
		while(k<e){
		System.out.println(even[k]);
		k++;
		}
		int m=0;
				System.out.println("odd numbers = ");
		while(m<o){
		System.out.println(odd[m]);
		m++;
		}
		
}}