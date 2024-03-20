package solved.LSP;

import java.util.ArrayList;

public class FastFoodRestaurant extends FastFoodWaitTime implements IRestaurant
{
    //function that runs the restaurant using function defined in the restaurant interface
    @Override
    public void runRestaurant()
    {
        ArrayList<String> order = new ArrayList<>();
        order.add("Burger");
        order.add("Fries");
        order.add("Chocolate Milkshake");
        order.add("Chicken Burger");
        order.add("Diet Coke");
        int driveTime = getDriveTime(order);
        System.out.println("Drive time is: " + driveTime);
        int customers = 12;
        int waitTime = getLineTime(customers);
        System.out.println("The current wait time is: " + waitTime + " minutes.");
    }
}
