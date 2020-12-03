
public class Commission extends Hourly{
	private double totalSales;		// 총 판매액
	private double rateOfCm;	// 커미션 비율
	
	public Commission (String eName, String eAddress, String ePhone,
            String socSecNumber, double hoursWorked, double rateOfCm){		// 이름, 주소, 전화번호, 주민등록번호, 시간당 임금, 커미션 비율
		super(eName, eAddress, ePhone, socSecNumber, hoursWorked);		// 상속 호출
		
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
