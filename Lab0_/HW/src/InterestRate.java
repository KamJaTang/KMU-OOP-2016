import java.util.Scanner;

public class InterestRate {
	public static void main (String args[])
	{
		/*** double i = 0.08; //������
		int n = 20; //���� ���� Ƚ��(�⵵ ��)
		double PMT = 10000; //�ų� �ޱ� ���ϴ� �ݾ�
		double PV = PMT * (((Math.pow(1+i, n-1)-1)/i) / (Math.pow(1+i, n-1)+1)) ;
		**/
		Scanner stdin = new Scanner(System.in);
		double i = stdin.nextDouble();
		int n = stdin.nextInt();
		double PMT = stdin.nextDouble();
		double PV = PMT * (((Math.pow(1+i, n-1)-1)/i) / (Math.pow(1+i, n-1)+1)) ;
		
		System.out.println(PV + "�޷�");
	}

}
