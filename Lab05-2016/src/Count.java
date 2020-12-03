// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.*;

public class Count
{
  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in); // standard input
      String phrase;    // a string of characters
      int countBlank;   // the number of blanks (spaces) in the phrase 
      int length;       // the length of the phrase
      char ch;          // an individual character in the string
      int countA;		// the number of A in the phrase
      int countE;		// the number of E in the phrase
      int countS;		// the number of S in the phrase
      int countT;		// the number of T in the phrase
      
      // Print a program header
      System.out.println();
      System.out.println("Character Counter");
      System.out.println();

      // Read in a string and find its length
      System.out.print("Enter a sentence or phrase or type quit: ");
      phrase = in.nextLine();
      length = phrase.length();

      // Initialize counts
      countBlank = 0;
      countA = 0;
      countE = 0;
      countS = 0;
      countT = 0;

      
      while (!phrase.equals("quit"))
      {
    	  // a for loop to go through the string character by character
    	  // and count the blank spaces
    	  for (int numOfLength = 0; numOfLength < length; numOfLength++)
    	  {
    		  if (phrase.charAt(numOfLength) == ' ')
    		  {
    			  countBlank += 1; 
    		  }
    	  
    		  ch = phrase.charAt(numOfLength) ;
          
    		  switch(ch)
    		  {
    		  case 'a' : countA++;
          		break;
    		  case 'A' : countA++;
    		  	break;
    		  case 'e' : countE++;
    		  	break;
    		  case 'E' : countE++;
    		  	break;
    		  case 's' : countS++;
    		  	break;
    		  case 'S' : countS++;
    		  	break;
    		  case 't' : countT++;
          		break;
    		  case 'T' : countT++;
          		break;
    		  }
    	  }

      // Print the results
    	  System.out.println();
    	  System.out.println("Number of blank spaces: " + countBlank);
    	  System.out.println("Number of A spaces: " + countA);
    	  System.out.println("Number of E spaces: " + countE);
    	  System.out.println("Number of S spaces: " + countS);
    	  System.out.println("Number of T spaces: " + countT);
    	  System.out.println();
    	  
          // Read in a string and find its length
          System.out.print("Enter a sentence or phrase or type quit: ");
          phrase = in.nextLine();
          length = phrase.length();

          // Reset counts
          countBlank = 0;
          countA = 0;
          countE = 0;
          countS = 0;
          countT = 0;
      }

  }
}
