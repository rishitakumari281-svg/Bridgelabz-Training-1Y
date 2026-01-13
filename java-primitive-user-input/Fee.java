public class Fee{
	public static void main(String[] args){
		double fee=125000.0;
		double dis_per=10.0/100.0;
		double amount=dis_per*fee;
		double discount=fee-(amount);
		System.out.println("The discount amount is INR "+amount+" and final discounted fee is INR "+discount);
}}
		