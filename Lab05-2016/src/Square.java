// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************
import java.util.*;

public class Square
{

    int[][] square;
    Scanner in = new Scanner(System.in);

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
    	square = new int[size][size];
    }


    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
    	int sum=0;
    	for(int i=0;i<square.length;i++){
    		sum+=square[row-1][i];
    	}
    	return sum;
    }


    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
    	int sum=0;
    	for(int i=0;i<square.length;i++){
    		sum+=square[i][col-1];
    	}
    	return sum;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
    	int sum=0;
    	for(int row=0;row<square.length;row++){
    		for(int col=0;col<square.length;col++){
    			if(row==col){
    				sum+=square[row][col];
    			}
    		}
    	}
    	return sum;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
    	int sum=0;
    	for(int row=0;row<square.length;row++){
    		for(int col=0;col<square.length;col++){
    			if(row+col == square.length-1){
    				sum+=square[row][col];
    			}
    		}
    	}
    	return sum;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
    	boolean flag=true;
    	//sumRow들이 같은지 확인한다.    	sumRow(0)~sumRow(size)들을 검사한다.
    	for(int i=2;i<=square.length;i++){
    		if(sumRow(1)!=sumRow(i)){
    			flag=false;
    			return flag;
    		}
    	}
    	//sumCol들이 같은지 확인. 위와 동일
    	for(int i=1;i<=square.length;i++){
    		if(sumRow(1)!=sumCol(i)){
    			flag=false;
    			return flag;
    		}
    	}    	
    	//대각선들이 같은지 확인
    	if(sumCol(1)!=sumMainDiag()){
    		flag=false;
    		return flag;
    	}
    	if(sumCol(1)!=sumOtherDiag()){
    		flag=false;
    		return flag;
    	}
    	return flag;
    }

    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
    public void readSquare()
    {
	    for (int row = 0; row < square.length; row++){
	    	for (int col = 0; col < square.length; col ++){
	    		square[row][col] = in.nextInt();
	    	}
	    }
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
    	 for (int row = 0; row < square.length; row++){
 	    	for (int col = 0; col < square.length; col ++){
 	    		System.out.print(square[row][col]);
 	    	}
 	    	System.out.println();
 	    }
    	
    }

}