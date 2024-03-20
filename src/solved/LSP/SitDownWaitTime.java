package solved.LSP;

import java.time.LocalTime;

public class SitDownWaitTime
{
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
