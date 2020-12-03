package com.ibm.debug;
import java.io.*;
public class ExitCondition {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String exiting = new String("Quit");
		while (true) {
			System.out.println("Enter any string. To quit, type Quit");
			s = new String(br.readLine());
			if (s.equals(exiting)) {
				System.out.println("Goodbye");
				System.exit(0);
			} else {
				System.out.println("You typed \"" + s + "\"!");
			}
		}
	}
}
