import java.util.Scanner;
public class NaturalSum2{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		int sum,add=0;
		System.out.println("enter a no.");
		n=sc.nextInt();
			sum=n * (n+1) / 2;
			System.out.println("formula ans= "+sum);
			int i=0;
			while(i<=n){
				add=add+i;
				i++;
			}
			System.out.println("without formula= "+add);
			if(sum==add){
				System.out.println("verified that both are equal");
			}else{
				System.out.println("error");
}}}
			