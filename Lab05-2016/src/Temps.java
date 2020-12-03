// **********************************************************
//   Temps.java
//
//   This program reads in a sequence of hourly temperature 
//   readings (beginning with midnight) and prints the maximum
//   temperature (along with the hour, on a 24-hour clock, it 
//   occurred) and the minimum temperature (along with the hour
//   it occurred).
// **********************************************************

import java.util.*;

public class Temps
{
    public static void main(String[] args)
    {
	final int HOURS_PER_DAY = 24;

	int temp;   // a temperature reading
	
	// print program heading
	System.out.println();
	System.out.println("Temperature Readings for 24 Hour Period");
	System.out.println();
	
	Scanner in = new Scanner(System.in);
	
	int maxTemp = -10000;
	int miniTemp = 10000;

	int timeOfMax = 0;
	int timeOfMini = 0;
	
	for (int hour = 0; hour < HOURS_PER_DAY; hour++)
	{
	    System.out.print("Enter the temperature reading at " + hour +
				" hours: ");
	    temp = in.nextInt();
	    
	    if (temp > maxTemp){
	    	maxTemp = temp;
	    	timeOfMax = hour;
	    }
	    if (temp < miniTemp){
	    	miniTemp = temp;
	    	timeOfMini = hour;
	    }
	    
	}

	// Print the results
	System.out.println("Maximum temp is " + maxTemp + " and " + timeOfMax + "hour");
	System.out.println("Minimum temp is " + miniTemp + " and " + timeOfMini + "hour" );
    }
}
