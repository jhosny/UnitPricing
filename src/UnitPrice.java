import java.util.Scanner;
public class UnitPrice {
    // Written by: Joy Hosny
    // This Program calculates the total amount of the purchase of an item depending on the quantity.
    public static void main(String[ ] args) {
        Scanner stdin = new Scanner(System.in);
        int quantity, unitprice, totalamount;
    
        quantity = 0;
        unitprice = 0;
        
        System.out.print("Please enter the Quantity desired: ");
        quantity = stdin.nextInt();
        
        System.out.print("Please enter the Unit price: ");
        unitprice = stdin.nextInt();
    
        totalamount = quantity * unitprice;
    
       System.out.println("\n" + "The Quantity desired is : " + quantity);
       System.out.println("The Unit Price is : $" + unitprice);
       System.out.println("The Total Amount is : $" + totalamount);
    }}

      

