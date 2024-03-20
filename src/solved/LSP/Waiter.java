package solved.LSP;

import java.util.ArrayList;

public class Waiter
{
    public String name;
    public int employeeID;
    public ArrayList<Table> tables;
    public Waiter(String name, int employeeID)
    {
        this.name = name;
        this.employeeID = employeeID;
        this.tables = new ArrayList<>();
    }
    public void clearTable(Table table)
    {
        this.tables.remove(table);
    }
}