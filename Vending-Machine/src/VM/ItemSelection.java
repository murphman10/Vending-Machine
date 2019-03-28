package VM;
import java.util.Scanner;

/**Asa Murphy
 * Project 2: Vending Machine
 * CS 3354 Object Oriented Design
 * 02/14/2019
 *
 * Class Name: ItemSelection
 * Access Level: Public
 *
 * ItemSelection takes care of the the selection and transaction options if a customer wants to purchase an item. The
 * Selection method prompts the user to enter cash and then select an item from the machine or return the money. Based
 * off the users choice, it will either call the transaction method that passes the users input for balance or the
 * return money method that resets balance back to 0.00. If they choose to select an item, then the transaction method
 * is evoked where the user input is compared to a matching item code, the balance is checked to see if its more than
 * the price of the item, and the the stock of the item trying to be purchased. If all checks are passed then change is
 * calculated, the item quantity is deducted by one and the user is prompted the item they selected, along with their
 * change.
 */

public class ItemSelection
{
    ItemStock ps;
    double balance = 0; //Initial balance
    Scanner cin = new Scanner(System.in);

    public ItemSelection(ItemStock x) //Constructor.
    {
        ps = x;
    }

    public void Selection() //Stores users money input into a balance to be used for purchasing.
    {

        System.out.println("Enter cash amount: ");


        try {
            balance = cin.nextDouble(); // User input stored in balance

            while (balance > 0)
            {
                if (balance > 20) // If user inserts more than $20
                {
                    balance = 0;
                    System.out.println("Credit amount is too large. Your money has been returned, please try again");

                } else
                    {
                        System.out.println("Your balance is " + String.format("%.2f", balance) + "\n");
                        System.out.println("Select an option\n" +
                                           "1. Select an Item\n" +
                                           "2.Return money");

                    int input = cin.nextInt();

                    switch (input)
                    {
                        case 1:
                            transaction(balance); // Transaction method
                            break;

                        case 2:
                            ReturnMoney(); // Return Money method
                            break;

                    }

                }

            }
            return;

        }catch(Exception e)
        {
            System.out.println("Invalid input, please try again"); // Checks for invalid input
            cin.nextLine();
        }
    }

    public void transaction(double bal) // Transaction process
    {
        System.out.println("Enter item code");
        cin.nextLine();
        String code = cin.nextLine();

        for(int i = 0; i < 16; i++) // Traverse the array for the item the user wants.
        {
            if(code.equals(ps.inventory[i].code)) // If item code matches code stored in array.
            {
                if(bal >= ps.inventory[i].price) // If users balance is more than the items price.
                {
                    if(ps.inventory[i].quantity > 0) // If the item is not out of stock.
                    {
                        System.out.println("You have selected " + ps.inventory[i].name + "\n");

                        ps.inventory[i].quantity = ps.inventory[i].quantity - 1; // Subtract from quantity

                        calcChange(ps.inventory[i].price); // Calculate change

                    }else
                    {
                        System.out.println("That item is out of stock...please select a different item.\n");
                    }

                }else
                {
                    System.out.println("Insufficient funds. Please return your money and re-insert more cash if"
                                       + "you wish to select another Item.\n");

                }

            }
        }
    }

    public void calcChange(double price) // calculates change
    {
        double change = balance - price;
        balance = 0;
        System.out.println("Here is your change: " + String.format("%.2f", change) + ", Have a good day!\n");
    }

    public void ReturnMoney() //resets balance to 0 (Refunds money back to user)
    {
        balance = 0.00;
        System.out.println("Your balance is: $ " + String.format("%.2f", balance) +
                " and your money has been returned, Thank you.\n");

    }

}



