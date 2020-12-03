// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;

public class Shop
{
    public static void main (String[] args)
    {
	ArrayList cart = new ArrayList();

	Item item;
	String itemName;
	double itemPrice;
	int quantity;

	String keepShopping = "y";
        Scanner in = new Scanner(System.in);

	do 
	    {
		System.out.print ("Enter the name of the item: "); 
		itemName = in.next();

		System.out.print ("Enter the unit price: ");
		itemPrice = in.nextDouble();

		System.out.print ("Enter the quantity: ");
		quantity = in.nextInt();

		// *** create a new item and add it to the cart



		// *** print the contents of the cart object using println


		System.out.print ("Continue shopping (y/n)? ");
		keepShopping = in.next();
	    }
	while (keepShopping.equals("y"));

    }
}

