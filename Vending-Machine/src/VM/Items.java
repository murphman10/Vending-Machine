package VM;

/**Asa Murphy
 * Project 2: Vending Machine
 * CS 3354 Object Oriented Design
 * 02/14/2019
 *
 * Class Name: Items
 * Access Level: Public
 *
 * Items is a public class that contains all the information needed for an item in the vending machine.
 * Such information includes item price, the initial quantity of the items, the code name needed by the
 * user to select a specific item, and the literal name of the item the user is choosing.
 */

public class Items
{

    String code;  // Code the user will enter to select the item
    String name;  // Name of the Items in the vending machine.
    double price; // Price of the item in the vending machine.
    int quantity; // Amount of that particular item in that machine.


    Items (String code, String name, double price, int quantity ) //Constructor That will be used for every
                                                                 // item in the vending machine.
    {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

}
