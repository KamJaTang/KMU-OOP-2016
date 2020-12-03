
public class Commission extends Hourly{
	private double totalSales;		// �� �Ǹž�
	private double rateOfCm;	// Ŀ�̼� ����
	
	public Commission (String eName, String eAddress, String ePhone,
            String socSecNumber, double hoursWorked, double rateOfCm){		// �̸�, �ּ�, ��ȭ��ȣ, �ֹε�Ϲ�ȣ, �ð��� �ӱ�, Ŀ�̼� ����
		super(eName, eAddress, ePhone, socSecNumber, hoursWorked);		// ��� ȣ��
		
		this.rateOfCm = rateOfCm ;
		
	}
	
	public void addSales (double totalSaless){
		
		this.totalSales += totalSaless;
		
	}
	
	public double pay()
	   {
	      double payment = super.pay() + rateOfCm*totalSales;

	      totalSales = 0;

	      return payment;
	      
	   }
	
	public String toString(){
		String result = super.toString();
	    result += "\nTotal Sales: " + totalSales;
	    return result;
	      
	}
}
