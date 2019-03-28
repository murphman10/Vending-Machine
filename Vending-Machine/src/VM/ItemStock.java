package VM;

/**Asa Murphy
 * Project 2: Vending Machine
 * CS 3354 Object Oriented Design
 * 02/14/2019
 *
 * Class Name: ItemStock
 * Access Level: Public
 *
 * The ItemStock class contains a load Machine method that utilizes an array that holds all items available to the
 * user in the vending machine. It acts as a list with various items, prices, designated codes the user would
 * enter when selecting an item and shows that each item has an initial stock of 10. It also contains methods for
 * displaying Items, displaying quantity and a method for restocking the machine if items become low in stock.
 */

public class ItemStock
{

    Items[] inventory = new Items[16]; // Array that will store instances of the Items class.

    public void MachineItems() // Initializes an array to hold all items.
    {
        inventory[0] = new Items("A1", "Doritos", 1.25, 6);
        inventory[1] = new Items("A2", "Cheetos", 1.25, 6);
        inventory[2] = new Items("A3", "Cheese Crackers", 1.00, 6 );
        inventory[3] = new Items("A4", "Famous Amos Cookies", 1.50, 6);
        inventory[4] = new Items("B1", "Twix", 1.75, 6 );
        inventory[5] = new Items("B2", "Snickers", 1.75, 6);
        inventory[6] = new Items("B3", "Oreos", 1.50, 6);
        inventory[7] = new Items("B4", "Trail Mix", 1.25, 6);
        inventory[8] = new Items("C1", "Pop Tart", 1.50, 6);
        inventory[9] = new Items("C2", "Honey Bun", 1.75, 6);
        inventory[10] = new Items("C3", "Rusty Nails (CHOKING HAZARD)", 1.00, 6);
        inventory[11] = new Items("C4", "Packet of Dry Ramen", 2.00, 6);
        inventory[12] = new Items("D1", "The Briefcase from Pulp Fiction", 4.75, 6);
        inventory[13] = new Items("D2", "6-Month Runsecape Membership", 1.75, 6);
        inventory[14] = new Items("D3", "Granola Bar", 1.00, 6);
        inventory[15] = new Items("D4", "Copies of My Social Security Card", 0.50, 6);
    }

    public void displayItems() //Displays selection to the user.
    {

        for (int i = 0; i < 16; i++)
        {
            System.out.println(inventory[i].code + " " + inventory[i].name + " "
                               + "$" + String.format("%.2f", inventory[i].price));

        }

    }

    public void displayQuantity() //Displays item quantity to vending machine manager to determine if an
    {                             // item needs to be restocked.

        for(int a = 0; a < 16; a++)
        {
            System.out.println(inventory[a].name + " Stock: " + inventory[a].quantity + "\n"); //Displays item quantity.

        }
    }

    public void Restock()
    {
        for( int b = 0; b < 16; b++)
        {
            inventory[b].quantity = 6; //Resets all Item quantities to 10.
        }
    }

}