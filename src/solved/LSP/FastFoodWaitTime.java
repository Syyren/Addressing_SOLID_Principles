package solved.LSP;

import java.util.ArrayList;

public class FastFoodWaitTime
{
    //function that calculates how long the customer can validly wait for food at the drive thru
    public int getDriveTime(ArrayList<String> items)
    {
        return items.size();
    }
    //function that calculates an appropriate amount of time for a line based on qty of customers
    public int getLineTime(int customers)
    {
        return customers * 5;
    }
}