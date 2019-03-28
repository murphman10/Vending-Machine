package VM;
import java.util.Scanner;

/**Asa Murphy
 * Project 2: Vending Machine
 * CS 3354 Object Oriented Design
 * 02/14/2019
 *
 * Class Name: MachineSettings
 * Access Level: Public
 *
 * Machine settings calls two methods, depending on the users choice, they can either check the stock of the items in
 * the machine, and they can restock the machine if quantities are low or out of stock.
 */

public class MachineSettings
{
    ItemStock ps;

    public MachineSettings(ItemStock x)
    {
        ps = x;
    }


    public void Choice() // Machine settings method that contains a switch
    {
        Scanner cin = new Scanner(System.in);
        int input = 0;



        while(input != 3)
        {
            System.out.println("\nMachine Settings:\n" +
                    "1.Check Quantity\n" +
                    "2.Reload Machine\n" +
                    "3.Return to Main Menu");

            try
            {
                input = cin.nextInt();

                switch (input)
                {
                    case 1: ps.displayQuantity(); // Displays quantity
                            break;

                    case 2: ps.Restock(); // Resets all quantities to 10.
                           System.out.println("Thank you for Restocking the Machine");
                           ps.displayQuantity(); // Displays newly restocked machine.
                           break;

                    case 3: System.out.println("Back to Main Menu\n"); // Goes back to main driver class.
                }           return;

            } catch (Exception e)
            { System.out.println("Invalid input, please try again");
                cin.nextLine();
            }

        }

    }

}
