import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        boolean done= false;
        String trash= "";
        double itemPrice= 0.0;
        int FREE_SHIPPING =100;
        double shippingRate= .02;
        double shipping= 0;
        double totalCost= 0;
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.print("Enter price of item [numeric values only]: ");
            if (in.hasNextDouble())
            {
                itemPrice = in.nextDouble();
                in.nextLine();
                done= true;
            } else
            {
                trash=in.nextLine();
                System.out.println("You need to enter a valid amount, not: " + trash);
            }
        }
        while (!done);
        if (itemPrice >= FREE_SHIPPING)
        {
            shipping = 0;
            totalCost = itemPrice;
            System.out.println("Shipping was " + shipping);
            System.out.println("Your total cost is " + totalCost);
        }
        else
        {
            shipping = shippingRate * itemPrice;
            totalCost = shipping + itemPrice;
            System.out.printf("Shipping was %.2f\n", shipping);
            System.out.printf("Your total cost is %.2f\n", totalCost);
        }
    }

}