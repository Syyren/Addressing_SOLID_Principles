package violated.LSP;

import java.time.LocalTime;
import java.util.ArrayList;

public class RestaurantWaitTime
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
    //function that assigns a new table to a waiter after they finish with one
    public void tableAssignment(Waiter waiter, Table newTable, Boolean rushHour)
    {
        waiter.tables.removeIf(Table::isAvailable);
        newTable.setAvailability(false);
        if (waiter.tables.size() < 6)
        {
            waiter.tables.add(newTable);
            tableTime(newTable);
        }
        else if (waiter.tables.size() < 10 && rushHour)
        {
            waiter.tables.add(newTable);
            tableTime(newTable);
        }
    }
    //function that calculates the time to have a table cleared by based on the time the customer is seated
    public void tableTime(Table table)
    {
        table.setTimeSeated(LocalTime.now());
        table.setTimeAllotted(table.getTimeSeated().plusMinutes(60));
    }
}
