public class StringTester {
	public static void main(String args[])
	{
		String inputString = "The quick brown fox jumps over the lazy dog";
		
		String sub1 = inputString.substring(0,1); //T
		String sub2 = inputString.substring(2,3); //e
		String sub3 = inputString.substring(22,24); //mp
		String sub4 = inputString.substring(21,22); //u
		String sub5 = inputString.substring(24,26); //s 
		String sub6 = inputString.substring(16,17); //f
		String sub7 = inputString.substring(42,43); //g
		String sub8 = inputString.substring(6,7); //i
		String sub9 = inputString.substring(31,32); //t

		String concat1 = sub1.concat(sub2);
		String concat2 = concat1.concat(sub3);
		String concat3 = concat2.concat(sub4);
		String concat4 = concat3.concat(sub5);
		String concat5 = concat4.concat(sub6);
		String concat6 = concat5.concat(sub4);
		String concat7 = concat6.concat(sub7);
		String concat8 = concat7.concat(sub8);
		String concat9 = concat8.concat(sub9);
		
		System.out.println(concat9);
		
	}

}
