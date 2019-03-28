package VM;
import java.util.Scanner;

/**Asa Murphy
 * Project 2: Vending Machine
 * CS 3354 Object Oriented Design
 * 02/14/2019
 *
 * Class Name: MainMachine
 * Access Level: Public
 *
 * MainMachine works as the main driver class that is the first prompt when the program is running. It displays the items
 * in the machine, and then prompts the user with options to either select an item, access the machine settings, or to
 * close the program.
 */

public class MainMachine
{
    public static void main(String args[])
    {
        ItemStock ps = new ItemStock();
        ItemSelection t = new ItemSelection(ps);
        MachineSettings ms = new MachineSettings(ps); //uses the array that's in THIS main driver class

        ps.MachineItems();//Initializes the array of vending machine items from ItemStock class.

        Scanner cin = new Scanner(System.in);
        int input = 0;



        while(input != 3)
        {
            ps.displayItems(); // The first thing the customer sees when approaching a vending machine, are the items.
            System.out.println("\nWelcome to Murphy's Vending. SATISFY YOUR HUNGER!!!!\n" +
                               "1. Insert Cash\n" +
                               "2. Machine Settings\n" +
                               "3. Exit");

            try
            {
                input = cin.nextInt();

                switch (input)
                {
                    case 1: t.Selection();// Insert and store user input in balance place holder.
                            break;


                    case 2: ms.Choice(); // gives 2 options: 1. Display item quantities and 2. Restock the machine.
                            break;

                    case 3: System.out.println("You have exited the program");//Quit Program
                            break;
                }

            } catch (Exception e)
              { System.out.println("Invalid input, please try again");
                cin.nextLine();
              }

        }


    }

}
