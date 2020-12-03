import java.util.Scanner;

public class InterestRate {
	public static void main (String args[])
	{
		/*** double i = 0.08; //이자율
		int n = 20; //이자 지불 횟수(년도 수)
		double PMT = 10000; //매년 받기 원하는 금액
		double PV = PMT * (((Math.pow(1+i, n-1)-1)/i) / (Math.pow(1+i, n-1)+1)) ;
		**/
		Scanner stdin = new Scanner(System.in);
		double i = stdin.nextDouble();
		int n = stdin.nextInt();
		double PMT = stdin.nextDouble();
		double PV = PMT * (((Math.pow(1+i, n-1)-1)/i) / (Math.pow(1+i, n-1)+1)) ;
		
		System.out.println(PV + "달러");
	}

}
