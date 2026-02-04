import java.util.Scanner;
public class Compare{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10];
	for( int i=0; i<5; i++){
    System.out.println("enter the number");
    n[i]=sc.nextInt();
	}
	for(int i=0; i<5; i++){
		if(n[i]>0){
			System.out.println("positive");
			if(n[i]%2==0){
				System.out.println("even");
			}
			else{
				System.out.println("odd");
			}
		}
		else if(n[i]==0){
			System.out.println("zero");
		}
		else{
			System.out.println("negative");
		}
	}
	if(n[0]==n[4]){
		System.out.println("equal");
	}
	else if(n[0]>n[4]){
		System.out.println("first number is greater than last number");
	}
	else{
		System.out.println("first number is lesser than last number");
	}
	}
}
