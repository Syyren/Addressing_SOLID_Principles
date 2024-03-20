package violated.LSP;

import java.util.ArrayList;

public class SitDownRestaurant extends RestaurantWaitTime
{
    private ArrayList<Waiter> waiters;
    //function that runs the restaurant using the restaurant wait time parent class
    public void runRestaurant()
    {
        Waiter waiter1 = new Waiter("John", 1);
        Waiter waiter2 = new Waiter("Steve", 2);
        Waiter waiter3 = new Waiter("Jessica", 3);
        ArrayList<Table> tables = new ArrayList<>();
        for (int i = 0; i < 17; i++)
        {
            Table tempTable = new Table(i, true);
            tables.add(tempTable);
        }
        ArrayList<Waiter> waiters = new ArrayList<>();
        waiters.add(waiter1);
        waiters.add(waiter2);
        waiters.add(waiter3);
        for (Waiter waiter : waiters)
        {
            for (Table table : tables)
            {
                tableAssignment(waiter, table, false);
            }
        }
    }
}
