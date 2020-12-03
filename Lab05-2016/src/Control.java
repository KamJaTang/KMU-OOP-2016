import java.util.*;

//	An exploration of basic control structures.
class Control {

	//	Processes input using a loop and a conditional.
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = in.nextInt();
		if (num >= 0) {
			while (num <= 50) {
				if (num%5 == 0)
					System.out.println(num);
					num = num + 1;
			}
		}
		else {
			System.out.println("ERROR");
		}

	}	// method main

}	// class Control
