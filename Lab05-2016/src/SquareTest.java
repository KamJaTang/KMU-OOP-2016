// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************
import java.util.*;

public class SquareTest
{
    public static void main(String[] args)
    {

	int count = 1;                 //count which square we're on
        Scanner in = new Scanner(System.in);
	int size = in.nextInt(); //size of next square
	//Expecting -1 at bottom of input file
	while (size != -1)
	    {

		//create a new Square of the given size
		Square s = new Square(size);

		//call its read method to read the values of the square
		s.readSquare();
		System.out.println("\n******** Square " + count + " ********");
		//print the square
		s.printSquare();
		//print the sums of its rows
		for(int i=1;i<=size;i++){
			System.out.println(s.sumRow(i));
		}
		//print the sums of its columns
		for(int i=1;i<=size;i++){
			System.out.println(s.sumCol(i));
		}
		//print the sum of the main diagonal
		System.out.println(s.sumMainDiag());
		//print the sum of the other diagonal
		System.out.println(s.sumOtherDiag());
		//determine and print whether it is a magic square
		System.out.println(s.magic());


		//get size of next square
		size = in.nextInt();

	    }
	System.out.println("Bye~BYE~");
   }
}


